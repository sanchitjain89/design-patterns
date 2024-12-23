package observer.example;

class WeatherAlertSystem implements Observer {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("\nWeather Alert System:");
        if (weatherData.getTemperature() > 35) {
            System.out.println("⚠️ HIGH TEMPERATURE ALERT!");
        }
        if (weatherData.getHumidity() > 70) {
            System.out.println("⚠️ HIGH HUMIDITY ALERT!");
        }
        if (weatherData.getPressure() < 970) {
            System.out.println("⚠️ STORM WARNING!");
        }
    }
}
