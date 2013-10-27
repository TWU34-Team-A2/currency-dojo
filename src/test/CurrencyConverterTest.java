import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 3:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConverterTest {

    @Test
    public void euroAndUsdollarValueShouldNotBeEqual()
    {
        CurrencyConverter converter = new CurrencyConverter();
        boolean result = converter.checkIfEquals(new Euro(1), new USDollar(1));
        assertFalse(result);
    }

    @Test
    public void shouldReturn13Dot5DollarsWhen10Euro() {
        CurrencyConverter converter = new CurrencyConverter();
        boolean result = converter.checkIfEquals(new Euro(10f), new USDollar(13.5f));
        assertTrue(result);
    }

    @Test
    public void shouldReturn847Dot8RupeesWhen10Euro() {
        CurrencyConverter converter = new CurrencyConverter();
        boolean result = converter.checkIfEquals(new Euro(10f), new Rupee(740.76f));
        assertTrue(result);
    }

    @Test
    public void euroShouldNotEqualDollarOfSameAmount() {
        CurrencyConverter converter = new CurrencyConverter();
        boolean result = converter.checkIfEquals(new Euro(10f), new USDollar(10f));
        assertFalse(result);
    }

}
