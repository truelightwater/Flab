package fan2;

public class Fan {
    Button button;
    Directionable directionable;
    WindSpeedable windSpeedable;
    private int color;  // 선풍기 색깔유무
    private boolean isFan; // 선풍기에 팬이 있는지 없는지, 무풍선풍기는 false


    public void setDirectionable(Directionable dir) {
        directionable = dir;
    }

    public void setWindSpeedable(WindSpeedable wind) {
        windSpeedable = wind;
    }


    public void performDirection(Button button) {
        directionable.fanDirection(button);
    }

    public void performWindSpeed(Button button) {
        windSpeedable.fanWindSpeed(button);
    }
}
