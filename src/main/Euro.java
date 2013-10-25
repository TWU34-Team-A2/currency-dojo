public class Euro {
    private double value;

    public Euro(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (getClass() != o.getClass() && o.getClass()!=Dollar.class)) return false;

        if (o.getClass()==Dollar.class) {
            Dollar dollar = (Dollar) o;
            return this.value==dollar.getValue()/1.35;
        }

        Euro euro = (Euro) o;

        if (value != euro.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int)value;
    }

    public Euro add(Euro euro) {
        return new Euro(this.value + euro.value);
    }
}
