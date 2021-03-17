package classes;

public class Char extends DataType {
    protected char value;

    public void setValue(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "2 bytes. Stores a single character/letter or ASCII values";
    }
}
