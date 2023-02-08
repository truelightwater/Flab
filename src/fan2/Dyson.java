package fan2;

import fan2.directions.NewDirection;
import fan2.windSpeeds.NewWindSpeed;

public class Dyson extends Fan {

    public Dyson() {
        directionable = new NewDirection();
        windSpeedable = new NewWindSpeed();
    }


}
