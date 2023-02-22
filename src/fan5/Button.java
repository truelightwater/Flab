package fan5;

public enum Button {
    HIGH("강풍"), MEDIUM("약풍"), LOW("미풍"), OFF("OFF"),
    LEFT("왼쪽"), RIGHT("오른쪽"), FIX("고정");

    private String button;

    Button(String button) {
        this.button = button;
    }

    public String getButton() {
        return button;
    }
}
