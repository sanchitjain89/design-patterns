package command.recall.another;

import java.util.ArrayList;
import java.util.List;

interface Command{
    public void execute();
    public void undo();
}

class Light{
    private boolean isOn = false;

    public void turnOn(){
        isOn = true;
        System.out.println("Light is ON");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Light is OFF");
    }
}

class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

class RemoteControl{

    List<Command> commandHistory = new ArrayList<>();
    Command undoCommand;

    public void invoke(Command command){
        command.execute();
        commandHistory.add(command);
        undoCommand = command;
    }

    public void undo(){
        if (undoCommand != null){
            undoCommand.undo();
            commandHistory.removeLast();
        }
    }

}

public class Demo {

    public static void main(String[] args) {
        Light roomLight = new Light();

        LightOnCommand lightOn = new LightOnCommand(roomLight);
        LightOffCommand lightOff = new LightOffCommand(roomLight);

        RemoteControl rc = new RemoteControl();
        rc.invoke(lightOn);
        rc.invoke(lightOff);
        rc.undo();

    }
}
