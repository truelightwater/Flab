package fanRunnable;

import fan3.Fan;
import fan3.commands.*;
import fan3.RemoteControl;

public class Customer3 {
    public static void main(String[] args) {
        // Invoker
        RemoteControl remote = new RemoteControl();

        // Receiver
        Fan fanLivingRoom = new Fan("거실");

        // Command Object
        FanHighCommand highCommand = new FanHighCommand(fanLivingRoom);
        FanMediumCommand mediumCommand = new FanMediumCommand(fanLivingRoom);
        FanLowCommand lowCommand = new FanLowCommand(fanLivingRoom);
        FanOffCommand offCommand = new FanOffCommand(fanLivingRoom);

        // Command Load
        remote.setCommand(0, mediumCommand, offCommand);
        remote.setCommand(1, highCommand, offCommand);


        // Execute
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        System.out.println(remote);
        remote.undoButtonWasPushed();
    }
}