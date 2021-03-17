package classes;

public class Byte extends Integer {
    protected byte value;

    public void setValue(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "1 byte. Stores whole numbers from -128 to 127";
    }
}
