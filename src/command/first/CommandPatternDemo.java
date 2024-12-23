package command.first;

// Client code
public class CommandPatternDemo {
    public static void main(String[] args) {
        // Create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Thermostat thermostat = new Thermostat();

        // Create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        // Create invoker
        SmartHomeController remote = new SmartHomeController();

        // Setup remote
        remote.setCommand(0, livingRoomLightOn);
        remote.setCommand(1, livingRoomLightOff);
        remote.setCommand(2, kitchenLightOn);
        remote.setCommand(3, kitchenLightOff);
        remote.setCommand(4, setTemp);

        // Use remote
        remote.executeCommand(0); // Turn on living room light
        remote.executeCommand(2); // Turn on kitchen light
        remote.executeCommand(4); // Set temperature
        remote.undoLastCommand(); // Undo temperature change
        remote.executeCommand(1); // Turn off living room light
        remote.undoLastCommand(); // Undo turning off living room light
    }
}
