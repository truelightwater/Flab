package fan2;

public abstract class Fan {
    Button button;
    Directionable directionable;
    WindSpeedable windSpeedable;

    public void performDirection() {
        directionable.fanDirection(button);
    }

    public void performWindSpeed() {
        windSpeedable.fanWindSpeed(button);
    }
}
