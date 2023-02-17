package fanRunnable;

import fan3.Fan;
import fan3.commands.FanOffCommand;
import fan3.commands.FanOnCommand;
import fan3.RemoteControl;

public class Customer3 {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Fan fan = new Fan();
        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);

        remote.setCommand(fanOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(fanOffCommand);
        remote.buttonWasPressed();
    }
}
