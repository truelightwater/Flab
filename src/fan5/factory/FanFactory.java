package fan5.factory;

import fan5.commands.receiver.Fan;

public class FanFactory {
    public static Fan createFan(String fanType) {
        if (fanType.equalsIgnoreCase("Dyson")) {
            return new Dyson("dyson");
        } else if (fanType.equalsIgnoreCase("Xiomi")) {
            return new Xiomi("xiomi");
        } else {
            throw new IllegalArgumentException("선풍기가 없습니다.");
        }
    }

}
