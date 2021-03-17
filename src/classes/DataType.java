package classes;

public abstract class DataType {
    protected String name;
    protected int size;

    public abstract String get_info();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
