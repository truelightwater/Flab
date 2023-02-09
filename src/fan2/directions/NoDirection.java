package fan2.directions;

import fan2.Button;

public class NoDirection implements Directionable {
    @Override
    public String fanDirection(Button button) {
        String str = "";
        str += new String("사실..손선풍기는 손으로 방향을 바꿔야 합니다.");

        return str;
    }
}
