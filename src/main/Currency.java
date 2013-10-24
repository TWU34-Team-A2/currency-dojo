import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/24/13
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Currency {

    private String name;
    private double value;

    public final static  Map<String, Double> rates = new HashMap<String, Double>();
    static{
        rates.put("Euro", 1.35);
        rates.put("USD", 1.0);
        rates.put("Rupee", 0.0163);
    }

    public Currency(double value, String name) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;

        Currency currency = (Currency) o;

        double actualValue = exchangeToDolar(value, name);
        double givenValue = exchangeToDolar(currency.value, currency.name);

        return actualValue == givenValue;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double exchangeToDolar(double actualValue, String actualCurrency) {
        return Math.round(actualValue * rates.get(actualCurrency)*100)/100;
    }
}
