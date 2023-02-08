package fan2;

public enum Button {
    LEFT("left"), RIGHT("right"), CENTER("center"), ROTATION("360"),
    LEVEL1("1"),LEVEL2("2"), LEVEL3("3"), LEVEL4("4"), LEVEL5("5");

    private String button;

    Button(String button) {
        this.button = button;
    }

    public String getButton() {
        return button;
    }

}
