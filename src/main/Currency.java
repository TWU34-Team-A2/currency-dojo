/**
 * Created with IntelliJ IDEA.
 * User: vaibhavk
 * Date: 27/10/13
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Currency {


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

        currency = currency.toEuro(currency);

        if (Double.compare(currency.value, value) != 0) return false;

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

    public abstract Euro toEuro(Currency currency);

}
