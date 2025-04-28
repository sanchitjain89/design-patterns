package command;

// Client
public class CommandPatternDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.pressButton(lightOn);
        remote.pressButton(lightOff);
        remote.pressUndo();
    }
}
