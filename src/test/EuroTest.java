import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.Test;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 3:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class EuroTest {

    @Test
    public void twoInstancesWithSameValueShouldBeEqual()
    {
        assertEquals(new Euro(10), new Euro(10));
        assertFalse(new Euro(10).equals(null));
        assertFalse(new Euro(10).equals(new Object()));
        assertEquals(new Euro(10), new Euro(5).add(new Euro(5)));
    }





}
