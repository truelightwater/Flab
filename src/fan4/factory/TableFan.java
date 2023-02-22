package fan4.factory;

public class TableFan implements Fan{
    @Override
    public void switchOn() {
        System.out.println("테이블 선풍기가 켜졌습니다.");
    }

    @Override
    public void switchOff() {
        System.out.println("테이블 선풍기가 꺼졌습니다.");

    }
}
