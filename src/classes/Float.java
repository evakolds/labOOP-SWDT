package classes;

public class Float extends FloatingPoint {
    protected float value;

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
    @Override
    public String get_info() {
        return "4 bytes. Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits";
    }
}
