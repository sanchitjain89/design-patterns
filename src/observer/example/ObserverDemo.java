package observer.example;

// Client code demonstrating usage
public class ObserverDemo {
    public static void main(String[] args) {
        // Create Weather Station (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create Display Panels (Observers)
        Observer phoneDisplay1 = new PhoneDisplay("Phone");
        Observer phoneDisplay2 = new PhoneDisplay("Tablet");
        Observer ledDisplay = new LEDDisplay();

        // Register Observers
        weatherStation.addObserver(phoneDisplay1);
        weatherStation.addObserver(phoneDisplay2);
        weatherStation.addObserver(ledDisplay);

        // Change temperature and notify observers
        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        // Unregister an observer and update again
        weatherStation.removeObserver(phoneDisplay2);
        weatherStation.setTemperature(28.0f);
    }
}
