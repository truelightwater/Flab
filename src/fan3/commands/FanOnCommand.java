package fan3.commands;

import fan3.Fan;
import fan3.commands.Command;

public class FanOnCommand implements Command {
    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();

    }
}
