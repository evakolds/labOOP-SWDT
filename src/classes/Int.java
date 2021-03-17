package classes;

public class Int extends Integer {
    protected int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "4 bytes. Stores whole numbers from -2,147,483,648 to 2,147,483,647";
    }
}
