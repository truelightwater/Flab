package fanRunnable;

import fan4.command.Command;
import fan4.command.FanOffCommand;
import fan4.command.FanOnCommand;
import fan4.factory.Fan;
import fan4.factory.FanFactory;

public class Customer4 {
    public static void main(String[] args) {

        Fan tableFan = FanFactory.createFan("table");
        Command tableFanOnCommand = new FanOnCommand(tableFan);
        Command tableFanOffCommand = new FanOffCommand(tableFan);

        Fan livingRmFan = FanFactory.createFan("livingRoom");
        Command livingRmFanOnCommand = new FanOnCommand(livingRmFan);
        Command livingRmFanOffCommand = new FanOffCommand(livingRmFan);

        tableFanOnCommand.execute();
        tableFanOffCommand.execute();
        System.out.println();
        livingRmFanOnCommand.execute();
        livingRmFanOffCommand.execute();
    }
}
