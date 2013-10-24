import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/24/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class EuroTest {

    @Test
    public void shouldBeEquals() {
         assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void shouldNotBeEquals() {
        assertNotSame(new Euro(10), new Euro(20));
        assertFalse(new Euro(10).equals(new Euro(20)));
    }

    @Test
    public void shouldNotEqualsToNull() {
        assertNotSame(new Euro(10), null);
        assertFalse(new Euro(10).equals(null));
    }

    @Test
    public void shouldNotEqualsToNewObject() {
        assertNotSame(new Euro(10), new Object());
        assertFalse(new Euro(10).equals(new Object()));
    }

    @Test
    public void shouldEqualHashSet() {
        Set<Euro> set1 = new HashSet<Euro>();
        Set<Euro> set2 = new HashSet<Euro>();
        set1.add(new Euro(10));
        set2.add(new Euro(10));
        assertEquals(set1, set2);
    }

    @Test
    public void should10BeEqualsToTwo5Euro() {
        assertEquals(new Euro(10), new Euro(5).plus(new Euro(5)));
    }
}
