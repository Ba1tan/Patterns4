package CommandPattern.invoker;


import CommandPattern.command.Command;

public class RemoteControl {
    private Command[] commands;
    private Command lastCommand;

    public RemoteControl(int slotCount) {
        commands = new Command[slotCount];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
        lastCommand = commands[slot];
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
