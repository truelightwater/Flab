package fan2;

import fan2.arraylist.ArrayList;
import fan2.directions.Directionable;
import fan2.windSpeeds.WindSpeedable;


public class Fan {
    private String msg;

    Directionable directionable;
    WindSpeedable windSpeedable;


    /* 멘토님 코멘트
    - ArrayList 가 멤버변수로 되어 있는데, 이것이 효과적인가 ?
    - 실제 어떤 액션이 있을 때, ArrayList 는 그 때 Heap 영역에 올려도 되지 않을까 ?
    - 그에 대한 힌트는, late binding 를 고려해봐도 좋으지 않을까 ?
    - 만약 지금의 코드라면 ArrayList 에 액션들이 저장되게 될 것인데 액션이 많아지게 되면 ArrayList size 가 부담이 될 것이다.
    - 실제로 ArrayList 가 동작되는 원리, size 가 어떤식으로 변화되는지 확인하고 코드를 다시 생각해볼 것
    - 멀티 스레딩 환경이라고 생각했을 때에 공유자원이 없는 것 같아보인다.
    - 액션 같은 부분들을 뭔가 재사용 있게 뭔가 올려주고 팬을 어떤 별도의 스레드를 돌려서 개선해도 좋을 것 같다.
     */
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

    /* 멘토님 코멘트
    * - return을 해주어야 하는 것은 ArrayList로 구현체만 리턴해도 되지않을까 ?
    * - Object 타입을 리턴하는 것은 좋은 방법은 아닌 것 같다.
    * - 액션을 어떻게 하면 추상화 할 수 있을지 고민 해보면 좋을 것 같다.
    * - 커맨드 패턴에 대해서 학습해보기
    * */
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
