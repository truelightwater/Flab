package fan2.directions;

import fan2.Button;

public class NormalDirection implements Directionable {

    public String fanDirection(Button button) {
        String str = "";
        if (button == Button.LEFT) {
            str += new String("바람이 왼쪽으로 붑니다.");
        } else if (button == Button.RIGHT) {
            str += new String("바람이 오른쪽으로 붑니다.");
        }

        return str;
    }
}
