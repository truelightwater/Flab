package fan3.commands;

import fan3.Fan;
import fan3.commands.Command;

public class FanOffCommand implements Command {
    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}
