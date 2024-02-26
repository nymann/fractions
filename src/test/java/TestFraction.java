import dev.nymann.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFraction {
    @Test
    public void testSimpleFraction() {
        Fraction actual = new Fraction(1, 4).plus(new Fraction(1, 4));
        Fraction expected = new Fraction(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNonEqualNumerators() {
        var actual = new Fraction(1, 8).plus(new Fraction(3, 8));
        var expected = new Fraction(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumerator0() {
        var actual = new Fraction(0, 1).plus(new Fraction(0, 2));
        var expected = new Fraction(0, 0);
        assertEquals(expected, actual);
    }
}
