package fan2;

import fan2.arraylist.ArrayList;
import fan2.directions.Directionable;
import fan2.windSpeeds.WindSpeedable;


public class Fan {
    private String msg;

    Directionable directionable;
    WindSpeedable windSpeedable;

    ArrayList<String> history = new ArrayList<>();
    // late binding 생각해보기
    // ArrayList size 변화 생각해보기

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
    // 구현체 리턴해보기


    public void getStatus() {

    }

    public String toString() {
        String message = String.valueOf(directionable);

        char[] temp = message.toCharArray();
        for (char data : temp) {
            System.out.print(data);
        }
        System.out.println();

        return null;
    }


}
