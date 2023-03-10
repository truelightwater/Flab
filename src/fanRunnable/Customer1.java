package fanRunnable;

import fan.*;

public class Customer1 {
    public static void main(String[] args) {

        Direction direction = new Direction() {
            @Override
            public void toDirection(String state) {
                if (state == left) {
                    System.out.println("왼쪽으로만 바람이 붑니다.");
                } else if (state == right) {
                    System.out.println("오른쪽으로만 바람이 붑니다.");
                }
            }
        };


        WindSpeed windSpeed = new WindSpeed() {
            @Override
            public void fanWindSpeed(Button button) {
                switch (button) {
                    case Level1:
                        System.out.println("약한 바람");
                        break;
                    case Level2:
                        System.out.println("중간 바람");
                        break;
                    case Level3:
                        System.out.println("강한 바람");
                        break;
                }
            }



            @Override
            public void fanWindState(String state) {
                if (state == "nature") {
                    System.out.println("자연 바람");
                } else if (state == "general") {
                    System.out.println("인공 바람");
                }
            }
        };

        Fan fan = new Fan(direction, windSpeed);

        fan.toDirection(Direction.left);
        fan.fanWindSpeed(Button.Level2);
        fan.fanWindState("general");

        System.out.println(fan.toString());



    }
}
