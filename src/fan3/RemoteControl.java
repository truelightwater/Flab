package fan3;

import fan3.commands.Command;

public class RemoteControl {
    Command slot;

    public RemoteControl() { }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
