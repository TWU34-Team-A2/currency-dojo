import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/24/13
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyTest {

    @Test
    public void shouldNotEuroEqualToUSD() {
        assertFalse(new Currency(10, "Euro").equals(new Currency(10, "USD")));
    }

    @Test
    public void should10EuroEqualTo13USD() {
        assertTrue(new Currency(10, "Euro").equals(new Currency(13.5, "USD")));
    }

    @Test
    public void should10000RsEqualsTo163USD() {
        assertEquals(new Currency(100d,"Rupee"), new Currency(1.63,"USD"));
    }

    @Test
    public void should1234RsEqualsTo163USD() {
        assertEquals(new Currency(1234d,"Rupee"), new Currency(20.11,"USD"));
    }
}
