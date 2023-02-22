package fan5.commands.receiver;

import fan5.Button;

public class Fan {

    Button speed;
    Button direction;

    public Fan() {
        speed = Button.OFF;
        direction = Button.FIX;
    }

    public void high() {
        speed = Button.HIGH;
        System.out.println("선풍기가 " +speed.getButton()+ " 으로 출력되고 있습니다.");
    }

    public void medium() {
        speed = Button.MEDIUM;
        System.out.println("선풍기가 " +speed.getButton()+ " 으로 출력되고 있습니다.");
    }

    public void low() {
        speed = Button.LOW;
        System.out.println("선풍기가 " +speed.getButton()+ " 으로 출력되고 있습니다.");
    }

    public void left() {
        direction = Button.LEFT;
        System.out.println("선풍기 팬이 " +direction.getButton()+ " 으로만 출력되고 있습니다.");
    }

    public void right() {
        direction = Button.RIGHT;
        System.out.println("선풍기 팬이 " +direction.getButton()+ " 으로만 출력되고 있습니다.");
    }

    public void fix() {
        direction = Button.FIX;
        System.out.println("선풍기 팬이 " +direction.getButton()+ " 으로만 출력되고 있습니다.");
    }


    public void off() {
        speed = Button.OFF;
        System.out.println("선풍기가 " +speed.getButton()+ " 되었습니다.");
    }

    public Button getSpeed() {
        return speed;
    }

    public Button getDirection() { return direction; }
}
