/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/27/13
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rupees {
    private double value;

    public Rupees(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rupees rupees = (Rupees) o;

        if (Double.compare(rupees.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    public double getValue() {
        return value;
    }
}
