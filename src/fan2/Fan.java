package fan2;

import fan2.arraylist.ArrayList;
import fan2.directions.Direction;
import fan2.directions.Directionable;
import fan2.windSpeeds.WindSpeed;
import fan2.windSpeeds.WindSpeedable;

import java.util.HashSet;
import java.util.Set;

public class Fan {
    ArrayList<String> history = new ArrayList<>();

    Directionable directionable;
    WindSpeedable windSpeedable;
    String msg;

    public void setDirectionable(Directionable dir) {
        directionable = dir;
    }

    public void setWindSpeedable(WindSpeedable wind) {
        windSpeedable = wind;
    }

    public String performDirection(Button button) {
        msg = directionable.fanDirection(button);
        System.out.println(msg);

        return msg;
    }

    public void performWindSpeed(Button button) {
        windSpeedable.fanWindSpeed(button);
    }

    public Object getHistoryState() {
        history.addLast(directionable);
        history.addLast(windSpeedable);
        System.out.println(history);

        return true;
    }

    public void getStatus() {
        System.out.println(directionable);
    }

    public String toString() {
        String msg = String.valueOf(directionable);

        char[] temp = msg.toCharArray();
        for (char data : temp) {
            System.out.print(data);
        }
        System.out.println();

        return null;
    }


}
