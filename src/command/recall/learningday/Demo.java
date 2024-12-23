package command.recall.learningday;

import java.util.ArrayList;
import java.util.List;

interface Command{
    void execute();
    void undo();
}

class Light{

    private boolean isOn = false;

    public void turnOn(){
        isOn = true;
        System.out.println("Light is ON");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Light is Off");
    }
}

class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.turnOn();
    }

    public void undo(){
        light.turnOff();
    }
}

class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.turnOff();
    }

    public void undo(){
        light.turnOn();
    }
}

//Invoker
class RemoteControl{
    List<Command> commandHistory = new ArrayList<>();
    private Command undoCommand;

    public void pressButton(Command command){
        command.execute();
        commandHistory.add(command);
        undoCommand = command;
    }

    public void pressUndoCommand(){
        if (undoCommand != null){
            undoCommand.undo();
            commandHistory.removeLast();
        }
    }

}

public class Demo {

    public static void main(String[] args) {

        // CreateReceiver
        Light livingRoomLight = new Light();

        // Create concrete commands
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Demonstrate command pattern
        remote.pressButton(lightOn);
        remote.pressButton(lightOff);
        remote.pressUndoCommand();
    }
}
