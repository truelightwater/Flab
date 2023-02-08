package fan2;

import fan2.directions.Direction;
import fan2.directions.NoDirection;
import fan2.windSpeeds.WindSpeed;

public class Xiaomi extends Fan {

    public Xiaomi() {
        directionable = new Direction();
        windSpeedable = new WindSpeed();
    }

}
