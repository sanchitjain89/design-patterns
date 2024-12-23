package observer.example;

// Concrete Observer implementations
class PhoneDisplay implements Observer {
    private String deviceName;

    public PhoneDisplay(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(WeatherData weatherData) {
        System.out.println("\n" + deviceName + " - Phone Display Update:");
        System.out.printf("Temperature: %.1f°C\n", weatherData.getTemperature());
        System.out.printf("Humidity: %.1f%%\n", weatherData.getHumidity());
        System.out.printf("Pressure: %.1f hPa\n", weatherData.getPressure());
    }
}
