package fan3;

public class Fan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String FIX = "fix";

    String location;
    int speed;
    String direction;


    public Fan(String location) {
        this.location = location;
        speed = OFF;
        direction = FIX;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " 선풍기가 강풍으로 출력되고 있습니다.");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " 선풍기가 약풍으로 출력되고 있습니다.");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " 선풍기가 미풍으로 출력되고 있습니다.");
    }

    public void left() {
        direction = LEFT;
        System.out.println(location + " 선풍기 팬이 왼쪽으로만 출력되고 있습니다.");
    }

    public void right() {
        direction = RIGHT;
        System.out.println(location + " 선풍기 팬이 오른쪽으로만 출력되고 있습니다.");
    }

    public void fix() {
        direction = FIX;
        System.out.println(location + " 선풍기 팬이 고정되어 출력되고 있습니다.");
    }


    public void off() {
        speed = OFF;
        System.out.println("선풍기가 꺼졌습니다.");
    }

//    public void on() {
//        System.out.println("선풍기가 켜졌습니다.");
//    }

    public int getSpeed() {
        return speed;
    }

    public String getDirection() { return direction; }
}
