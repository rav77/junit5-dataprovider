package data;

public enum EnumProvider {

    ENUM1("Enum1 description"), ENUM2("Enum2 description"), ENUM3("Enum3 description");

    private final String text;

    EnumProvider(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
