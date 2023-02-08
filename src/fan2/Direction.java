package fan2;

public class Direction implements Directionable {

    public void fanDirection(Button button) {
        if (button == Button.LEFT) {
            System.out.println("바람이 왼쪽으로 붑니다.");
        } else if (button == Button.RIGHT) {
            System.out.println("바람이 오른쪽으로 붑니다.");
        }
    }
}
