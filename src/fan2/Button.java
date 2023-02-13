package fan2;
/* 멘토님 코멘트
- Enum 을 잘 쓸 수 있는 방법들에 대해서 공부해보기
- 오브?, ValueOf, 룩업? method 를 활용해서 Enum 의 코드값을 찾고 유틸리티 같은 메서드가 있다.
- this-play name, order-by ? 속성을 두어서 조금 더 Enum 에 살을 붙이는 방향으로 진행
 */
public enum Button {
    POWER("powerOn"), LEFT("left"), RIGHT("right"), CENTER("center"), ROTATION("360"),
    LEVEL1("1"),LEVEL2("2"), LEVEL3("3"), LEVEL4("4"), LEVEL5("5");

    private String button;

    Button(String button) {
        this.button = button;
    }

    public String getButton() {
        return button;
    }

}
