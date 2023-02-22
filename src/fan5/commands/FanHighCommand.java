package fan5.commands;

import fan5.Button;
import fan5.commands.receiver.Fan;

public class FanHighCommand implements Command {
    Fan fan;
    Button preSpeed;

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        preSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        if (preSpeed == Button.HIGH) {
            fan.high();
        } else if (preSpeed == Button.MEDIUM) {
            fan.medium();
        } else if (preSpeed == Button.LOW) {
            fan.low();
        } else if (preSpeed == Button.OFF) {
            fan.off();
        }
    }
}
