package fan;

public class Fan implements Direction, WindSpeed {
    private Direction direction;
    private WindSpeed windSpeed;

    public Fan() {
    }

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

    public String toString() {
        return ("("+direction+ "), ("+windSpeed+")");
    }


    @Override
    public void toDirection(String state) {
        direction.toDirection(state);
    }

    @Override
    public void fanWindSpeed(Button button) {
        windSpeed.fanWindSpeed(button);
    }

    @Override
    public void fanWindState(String state) {
        windSpeed.fanWindState(state);
    }
}
