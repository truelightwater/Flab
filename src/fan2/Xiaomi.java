package fan2;

import fan2.directions.NormalDirection;
import fan2.windSpeeds.NomalWindSpeed;

public class Xiaomi extends Fan {

    public Xiaomi() {
        directionable = new NormalDirection();
        windSpeedable = new NomalWindSpeed();
    }

}
