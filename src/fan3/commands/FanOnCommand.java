package fan3.commands;

import fan3.Fan;

public class FanOnCommand implements Command {
    Fan fan;
    int preSpeed;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.medium();
    }

    @Override
    public void undo() {
        if (preSpeed == Fan.HIGH) {
            fan.high();
        } else if (preSpeed == Fan.MEDIUM) {
            fan.medium();
        } else if (preSpeed == Fan.LOW) {
            fan.low();
        } else if (preSpeed == Fan.OFF) {
            fan.off();
        }
    }
}
