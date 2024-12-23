package command.first;

import java.util.Stack;

// Invoker (Remote Control)
class SmartHomeController {
    private Command[] commands = new Command[10];
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void executeCommand(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
            commandHistory.push(commands[slot]);
        }
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
