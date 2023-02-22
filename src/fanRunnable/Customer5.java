package fanRunnable;

import fan5.commands.*;
import fan5.commands.invoker.RemoteControl;
import fan5.commands.receiver.Fan;
import fan5.factory.FanFactory;

import java.util.ArrayList;

public class Customer5 {
    public static void main(String[] args) {
        // Invoker
        RemoteControl remote = new RemoteControl();

        // Receiver
        Fan DysonFan = FanFactory.createFan("Dyson");

        // Command Object
        FanHighCommand dsFanHighCommand = new FanHighCommand(DysonFan);
        FanMediumCommand dsFanMediumCommand = new FanMediumCommand(DysonFan);
        FanLowCommand dsFanLowCommand = new FanLowCommand(DysonFan);
        FanOffCommand dsFanOffCommand = new FanOffCommand(DysonFan);
        FanLeftCommand dsFanLeftCommand = new FanLeftCommand(DysonFan);
        FanRightCommand dsFanRightCommand = new FanRightCommand(DysonFan);
        FanFixCommand dsFanFixCommand = new FanFixCommand(DysonFan);

        // Command Load
        remote.setCommand(0, dsFanHighCommand, dsFanOffCommand);
        remote.setCommand(1, dsFanMediumCommand, dsFanOffCommand);
        remote.setCommand(2, dsFanLowCommand, dsFanOffCommand);
        remote.setCommand(3, dsFanLeftCommand, dsFanFixCommand);
        remote.setCommand(4, dsFanRightCommand, dsFanFixCommand);


        // Execute
        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(3);
        remote.onButtonWasPushed(4);
        remote.undoButtonWasPushed();

    }
}