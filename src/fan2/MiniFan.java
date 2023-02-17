package fan2;

import fan2.directions.NoDirection;
import fan2.windSpeeds.NomalWindSpeed;

public class MiniFan extends Fan {

    public MiniFan() {
        directionable = new NoDirection();
        windSpeedable = new NomalWindSpeed();
    }
}
