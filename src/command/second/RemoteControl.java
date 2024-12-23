package command.second;

import java.util.ArrayList;
import java.util.List;

// Invoker (Remote Control)
class RemoteControl {
    private List<Command> commandHistory = new ArrayList<>();
    private Command undoCommand;

    public void pressButton(Command command) {
        command.execute();
        commandHistory.add(command);
        undoCommand = command;
    }

    public void pressUndoButton() {
        if (undoCommand != null) {
            undoCommand.undo();
            commandHistory.remove(commandHistory.size() - 1);
        }
    }
}
