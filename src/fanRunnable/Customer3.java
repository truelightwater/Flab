package fanRunnable;

import fan3.Fan;
import fan3.FanOffCommand;
import fan3.FanOnCommand;
import fan3.SimpleRemoteControl;

public class Customer3 {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Fan fan = new Fan();
        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);

        remote.setCommand(fanOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(fanOffCommand);
        remote.buttonWasPressed();
    }
}
