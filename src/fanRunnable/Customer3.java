package fanRunnable;

import fan3.Fan;
import fan3.commands.*;
import fan3.RemoteControl;

public class Customer3 {
    public static void main(String[] args) {
        // Invoker
        RemoteControl remote = new RemoteControl();

        // Receiver
        Fan fanLivingRoom = new Fan();

        // Command Object
        FanHighCommand highCommand = new FanHighCommand(fanLivingRoom);
        FanMediumCommand mediumCommand = new FanMediumCommand(fanLivingRoom);
        FanLowCommand lowCommand = new FanLowCommand(fanLivingRoom);
        FanOffCommand offCommand = new FanOffCommand(fanLivingRoom);

        FanLeftCommand leftCommand = new FanLeftCommand(fanLivingRoom);
        FanRightCommand rightCommand = new FanRightCommand(fanLivingRoom);
        FanFixCommand fixCommand = new FanFixCommand(fanLivingRoom);

        // Command Load
        remote.setCommand(0, highCommand, offCommand);
        remote.setCommand(1, mediumCommand, offCommand);
        remote.setCommand(2, lowCommand, offCommand);

        remote.setCommand(3, leftCommand, fixCommand);
        remote.setCommand(4, rightCommand, fixCommand);
        remote.setCommand(5, fixCommand, fixCommand);


        // Execute
        System.out.println("----선풍기 세기-----");
        remote.onButtonWasPushed(0);            // 강풍 버튼
        remote.onButtonWasPushed(1);            // 약풍 버튼
        remote.undoButtonWasPushed();               // 이전 버튼(강풍)
        remote.onButtonWasPushed(2);            // 미풍 버튼
        remote.undoButtonWasPushed();               // 이전 버튼 (강풍)


        System.out.println("----선풍기 방향-----");
        remote.onButtonWasPushed(3);            // 왼쪽 바람
        remote.onButtonWasPushed(4);            // 오른쪽 바람
        remote.undoButtonWasPushed();               // 이전 버튼(왼쪽)
        remote.onButtonWasPushed(5);            // 고정 바람
        remote.undoButtonWasPushed();               // 이전 버튼(왼쪽)


    }
}