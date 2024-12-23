package observer.example;

// Client code demonstrating usage
public class ObserverDemo {
    public static void main(String[] args) {
        // Create the WeatherStation (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        Observer phoneApp1 = new PhoneDisplay("iPhone 12");
        Observer phoneApp2 = new PhoneDisplay("Samsung S21");
        Observer website = new WebsiteDisplay();
        Observer alertSystem = new WeatherAlertSystem();

        // Register observers to the weather station
        weatherStation.registerObserver(phoneApp1);
        weatherStation.registerObserver(phoneApp2);
        weatherStation.registerObserver(website);
        weatherStation.registerObserver(alertSystem);

        // Simulate weather changes
        System.out.println("--- First Weather Update ---");
        weatherStation.setMeasurements(24.5f, 65.0f, 1013.2f);

        // Remove one observer
        weatherStation.removeObserver(phoneApp2);

        System.out.println("\n--- Second Weather Update (After removing Samsung phone) ---");
        weatherStation.setMeasurements(36.5f, 72.0f, 968.0f);
    }
}