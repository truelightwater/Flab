package fan;

public class Fan implements Direction, WindSpeed {
    Direction direction;
    WindSpeed windSpeed;

    public Fan(Direction direction, WindSpeed windSpeed) {
        this.direction = direction;
        this.windSpeed = windSpeed;
    }

    @Override
    public void leftDirection() {
        direction.leftDirection();
    }

    @Override
    public void rightDirection() {
        direction.rightDirection();
    }

    @Override
    public void fanWindSpeed(int button) {
        windSpeed.fanWindSpeed(button);
    }
}
