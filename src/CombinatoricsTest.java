import org.junit.Test;

import static org.junit.Assert.*;

public class CombinatoricsTest {

    @Test
    public void factorial5() {
        assertEquals(120, Combinatorics.factorial(5));
    }

    @Test
    public void factorial1() {
        assertEquals(1, Combinatorics.factorial(1));
    }

    @Test
    public void factorial12() {
        assertEquals(479001600, Combinatorics.factorial(12));
    }

    @Test
    public void factorial9() {
        assertEquals(362880, Combinatorics.factorial(9));
    }
}