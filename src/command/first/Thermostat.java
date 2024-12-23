package command.first;

class Thermostat {
    private int temperature;
    private int previousTemperature;

    public void setTemperature(int temperature) {
        this.previousTemperature = this.temperature;
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + " degrees");
    }

    public void restorePreviousTemperature() {
        this.temperature = previousTemperature;
        System.out.println("Temperature restored to " + temperature + " degrees");
    }
}
