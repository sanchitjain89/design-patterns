package command;

import java.util.ArrayList;
import java.util.List;

// Invoker
class RemoteControl {
    private List<Command> commandHistory = new ArrayList<>();

    void pressButton(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}
