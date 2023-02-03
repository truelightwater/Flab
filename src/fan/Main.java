package fan;

public class Main {
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
            public void fanWindSpeed(int button) {
                switch (button) {
                    case 1 :
                        System.out.println("약한 바람이 붑니다.");
                        break;
                    case 2 :
                        System.out.println("중간 바람이 붑니다.");
                        break;
                    case 3 :
                        System.out.println("강한 바람이 붑니다.");
                        break;
                }
            }
            @Override
            public void fanWindState(String state) {
                if (state == "nature") {
                    System.out.println("자연바람이 나오고 있습니다.");
                } else if (state == "general") {
                    System.out.println("일반적인 바람이 나오고 있습니다.");
                }
            }
        };

        Fan fan = new Fan(direction, windSpeed);
        fan.toDirection(Direction.left);
        fan.fanWindSpeed(2);
        fan.fanWindState("general");

    }
}
