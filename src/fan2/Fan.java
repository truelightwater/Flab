package fan2;

import fan2.arraylist.ArrayList;
import fan2.directions.Directionable;
import fan2.windSpeeds.WindSpeedable;


public class Fan {
    private String msg;
    Directionable directionable;
    WindSpeedable windSpeedable;

    ArrayList<String> history = new ArrayList<>();

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
        msg = String.valueOf(directionable);

        char[] temp = msg.toCharArray();
        for (char data : temp) {
            System.out.print(data);
        }
        System.out.println();

        return null;
    }


}
