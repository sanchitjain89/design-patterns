package observer.example;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class WeatherStation implements Subject {
    private List<Observer> observers;
    private WeatherData weatherData;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    // Method that simulates weather changes
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.weatherData = new WeatherData(temperature, humidity, pressure);
        notifyObservers();
    }
}
