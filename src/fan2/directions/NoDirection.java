package fan2.directions;

import fan2.Button;

public class NoDirection implements Directionable {
    @Override
    public void fanDirection(Button button) {
        System.out.println("사실은...손 선풍기는 손으로 직접 방향을 바꿔어야 합니다.");
    }
}
