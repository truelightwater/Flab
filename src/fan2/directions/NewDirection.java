package fan2.directions;

import fan2.Button;
import fan2.directions.Directionable;

public class NewDirection implements Directionable {

    @Override
    public String fanDirection(Button button) {
        String str = "";
        if (button == Button.LEFT) {
            str += new String("바람이 왼쪽으로 붑니다.");
        } else if (button == Button.RIGHT) {
            str += new String("바람이 오른쪽으로 붑니다.");
        } else if (button == Button.CENTER) {
            str += new String("바람이 가운데로 붑니다.");
        } else if (button == Button.ROTATION) {
            str += new String("바람이 360도로 붑니다.");
        }

        return str;
    }
}
