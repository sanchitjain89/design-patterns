package observer.example;

class WebsiteDisplay implements Observer {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("\nWebsite Display Update:");
        System.out.println("Current Conditions:");
        System.out.printf("Temperature: %.1f°C\n", weatherData.getTemperature());
        System.out.printf("Humidity: %.1f%%\n", weatherData.getHumidity());
    }
}
