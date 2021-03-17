package classes;

public class Short extends Integer {
    protected short value;

    public void setValue(short value) {
        this.value = value;
    }

    public short getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "2 bytes. Stores whole numbers from -32,768 to 32,767";
    }
}
