package fan3;

import fan3.commands.Command;
import fan3.commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

public RemoteControl() {
    onCommands = new Command[6];
    offCommands = new Command[6];

    Command noCommand = new NoCommand();
    for (int i = 0; i < onCommands.length; i++) {
        onCommands[i] = noCommand;
        offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
}

public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
}

public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
}

public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
}

public void undoButtonWasPushed() {
    undoCommand.undo();
}

public String toString() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("\n-----리모컨-----\n");
    for (int i = 0; i < onCommands.length; i++) {
        buffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                "      " + offCommands[i].getClass().getName() + "\n");
    }
    buffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
    return buffer.toString();
}

}
