package classes;

public class Double extends FloatingPoint {
    protected double value;

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String get_info() {
        return "8 bytes. Stores fractional numbers. Sufficient for storing 15 decimal digits";
    }
}
