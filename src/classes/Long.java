package classes;

public class Long extends Integer {
    protected long value;

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "8 bytes. Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807";
    }
}
