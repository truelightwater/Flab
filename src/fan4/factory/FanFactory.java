package fan4.factory;

public class FanFactory {

    public static Fan createFan(String type) {
        if (type.equalsIgnoreCase("table")) {
            return new TableFan();
        } else if (type.equalsIgnoreCase("livingRoom")) {
            return new LivingRmFan();
        } else {
            throw new IllegalArgumentException("Invaild fan type.");
        }
    }
}
