package fan;

public class Main {
    public static void main(String[] args) {
        Direction direction = new Direction() {
            @Override
            public void leftDirection(String state) {
                System.out.println("왼쪽만 바람이 붑니다.");
            }

            @Override
            public void rightDirection(String state) {
                System.out.println("오른쪽으로만 바람이 붑니다.");
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
        };

        Fan fan = new Fan(direction, windSpeed);
        fan.leftDirection(Direction.left);
        fan.rightDirection(Direction.right);
        fan.fanWindSpeed(2);

    }
}
