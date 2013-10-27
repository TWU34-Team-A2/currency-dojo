/**
 * Created with IntelliJ IDEA.
 * User: vaibhavk
 * Date: 27/10/13
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Currency {


    private final double value;

    public Currency(double value)
    {
          this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;

        Currency currency;

        try
        {
            currency = (Currency) o;
        }
        catch (Exception ex)
        {
            return false;
        }

        if(o instanceof Dollar)
        {
            currency = ((Dollar) o).dollarToEuro(currency);
        }
        else if(o instanceof Rupee)
        {
            currency = ((Rupee) o).rupeeToEuro(currency);
        }

        if (Double.compare(currency.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    public Euro dollarToEuro(Currency dollar)
    {
        double rate = 1/1.35;

        return (new Euro(dollar.getValue() * rate));
    }

    public Euro rupeeToEuro(Currency rupee)
    {
        double rate = 1/74.076;

        return (new Euro(rupee.getValue() * rate));
    }

    public double getValue() {
        return value;
    }

}
