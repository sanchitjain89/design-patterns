package command.first;

// Receiver classes (devices that will be controlled)
class Light {
    private boolean isOn = false;
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(location + " Light is now ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(location + " Light is now OFF");
    }
}
