package observer.example;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject: Weather Station
class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    // Method to update temperature and notify observers
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("WeatherStation: Temperature updated to " + temperature + "°C");
        notifyObservers();
    }
}
