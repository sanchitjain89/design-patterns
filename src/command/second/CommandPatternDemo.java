package command.second;

// Client Code
public class CommandPatternDemo {
    public static void main(String[] args) {
        // Create receiver
        Light livingRoomLight = new Light();

        // Create concrete commands
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Demonstrate command pattern
        remote.pressButton(lightOn);    // Turns light on
        remote.pressButton(lightOff);   // Turns light off
        remote.pressUndoButton();       // Undoes last command (turns light back on)
    }
}
