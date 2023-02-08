package fanRunnable;

import fan2.*;
import fan2.directions.NoDirection;

public class Customer {

    public static void main(String[] args) {

        Fan xioami = new Xiaomi();
        xioami.performDirection(Button.LEFT);
        xioami.performWindSpeed(Button.LEVEL3);
        System.out.println("--");

        Fan dyson = new Dyson();
        dyson.performDirection(Button.RIGHT);
        dyson.performWindSpeed(Button.LEVEL5);
        System.out.println("--");

        Fan mini = new MiniFan();
        mini.performDirection(Button.LEFT);
        mini.setDirectionable(new NoDirection());       // 실행시점에서 구현체를 변경
        mini.performDirection(Button.POWER);
    }
}
