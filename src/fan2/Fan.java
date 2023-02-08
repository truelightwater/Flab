package fan2;

import fan2.directions.Directionable;
import fan2.windSpeeds.WindSpeedable;

public class Fan {
    Directionable directionable;
    WindSpeedable windSpeedable;

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
