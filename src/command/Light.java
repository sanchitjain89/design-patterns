package command;

// Receiver
class Light {
    private boolean isOn = false;

    void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }
}
