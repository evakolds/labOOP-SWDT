package classes;

public class Boolean extends DataType {
    protected boolean value;

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "1 bit. Stores true or false values";
    }
}
