package fan3.commands;

import fan3.Fan;

public class FanFixCommand implements Command{
    Fan fan;
    String preDirection;

    public FanFixCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        preDirection = fan.getDirection();
        fan.fix();
    }

    @Override
    public void undo() {
        if (preDirection == Fan.RIGHT) {
            fan.right();
        } else if (preDirection == Fan.LEFT) {
            fan.left();
        } else if (preDirection == Fan.FIX) {
            fan.fix();
        }
    }
}
