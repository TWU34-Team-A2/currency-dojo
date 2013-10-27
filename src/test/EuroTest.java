import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class EuroTest {

    @Test
    public void EuroTest() throws Exception {

        assertEquals(new Euro(10), new Euro(10));
        assertFalse(new Euro(10).equals(null));
        assertFalse(new Euro(10).equals(new Object()));
    }

    @Test
    public void shouldBeEuro10WhenEuro5PlusEuro5() throws Exception {
        Euro euro1 = new Euro(5);
        Euro euro2 = new Euro(5);

        assertEquals(new Euro(10),euro1.plus(euro2));
    }

    @Test
    public void dollarNotEqualEuro()
    {
        Euro euro = new Euro(10);
        Dollar dollar = new Dollar(10);

        assertFalse(euro.equals(dollar));
    }

    @Test
    public void dollar1_35EqualsEuro()
    {
        Euro euro = new Euro(10);
        Dollar dollar = new Dollar(13.5);

        assertTrue(euro.equals(dollar));
    }

    @Test
    public void rupees740_76EqualsEuro()
    {
        Euro euro = new Euro(10);
        Rupee rupee = new Rupee(740.76);

        assertTrue(euro.equals(rupee));
    }

}
