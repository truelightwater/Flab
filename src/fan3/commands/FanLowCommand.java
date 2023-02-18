package fan3.commands;

import fan3.Fan;

public class FanLowCommand implements Command {
    Fan fan;
    int preSpeed;

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        preSpeed = fan.getSpeed();
        fan.low();

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
