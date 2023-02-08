package fan2;

public class NewDirection implements Directionable {

    @Override
    public void fanDirection(Button button) {
        if (button == Button.LEFT) {
            System.out.println("바람이 왼쪽으로 붑니다.");
        } else if (button == Button.RIGHT) {
            System.out.println("바람이 오른쪽으로 붑니다.");
        } else if (button == Button.CENTER) {
            System.out.println("바람이 가운데로 붑니다.");
        } else if (button == Button.ROTATION) {
            System.out.println("바람이 360도로 붑니다.");
        }
    }
}
