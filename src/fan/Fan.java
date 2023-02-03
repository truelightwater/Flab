package fan;

public class Fan implements Direction, WindSpeed {
    Direction direction;
    WindSpeed windSpeed;

    public Fan(Direction direction, WindSpeed windSpeed) {
        this.direction = direction;
        this.windSpeed = windSpeed;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void toDirection(String state) {
        direction.toDirection(state);
    }

    @Override
    public void fanWindSpeed(int button) {
        windSpeed.fanWindSpeed(button);
    }
}
