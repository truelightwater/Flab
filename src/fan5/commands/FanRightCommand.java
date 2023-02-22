package fan5.commands;

import fan5.Button;
import fan5.commands.receiver.Fan;

public class FanRightCommand implements Command {
    Fan fan;
    Button preDirection;

    public FanRightCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        preDirection = fan.getDirection();
        fan.right();
    }

    @Override
    public void undo() {
        if (preDirection == Button.RIGHT) {
            fan.right();
        } else if (preDirection == Button.LEFT) {
            fan.left();
        } else if (preDirection == Button.FIX) {
            fan.fix();
        }
    }
}
