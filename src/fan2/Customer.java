package fan2;

public class Customer {

    public static void main(String[] args) {
        Fan xioami = new Xiaomi();
        xioami.performDirection(Button.LEFT);
        xioami.performWindSpeed(Button.LEVEL2);

        Fan dyson = new Dyson();
        dyson.performDirection(Button.CENTER);
        dyson.performWindSpeed(Button.ROTATION);

    }

}
