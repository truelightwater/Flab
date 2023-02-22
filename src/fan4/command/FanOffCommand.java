package fan4.command;

import fan4.factory.Fan;

public class FanOffCommand implements Command {

    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.switchOff();
    }
}
