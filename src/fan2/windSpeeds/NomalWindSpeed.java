package fan2.windSpeeds;

import fan2.Button;

public class NomalWindSpeed implements WindSpeedable {

    @Override
    public void fanWindSpeed(Button button) {
        switch (button) {
            case LEVEL1:
                System.out.println("미풍으로 바람이 붑니다.");
                break;
            case LEVEL2:
                System.out.println("약풍으로 바람이 붑니다.");
                break;
            case LEVEL3:
                System.out.println("강풍으로 바람이 붑니다.");
                break;
        }
    }
}