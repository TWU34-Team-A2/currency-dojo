import java.text.DecimalFormat;
import java.text.ParseException;

public class Euro {
    private double value;

    public Euro(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (getClass() != o.getClass() && o.getClass()!=Dollar.class && o.getClass() !=Rupees.class)) return false;

        if (o.getClass()==Dollar.class) {
            Dollar dollar = (Dollar) o;
            return this.value==dollar.getValue()/1.35;
        }

        if (o.getClass()==Rupees.class) {
            Rupees rupees = (Rupees) o;
            DecimalFormat df = new DecimalFormat("0.00");
            String formatted = df.format(rupees.getValue()/74.076);
            try {
                double finalRupeeValue = df.parse(formatted).doubleValue();
                return this.value== finalRupeeValue;
            } catch (ParseException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
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

    public double getValue() {
        return value;
    }
}
