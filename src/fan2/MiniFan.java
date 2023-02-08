package fan2;

import fan2.directions.Direction;
import fan2.windSpeeds.WindSpeed;

public class MiniFan extends Fan {

    public MiniFan() {
        directionable = new Direction();
        windSpeedable = new WindSpeed();
    }
}
