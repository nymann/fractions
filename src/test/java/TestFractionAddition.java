import dev.nymann.Fraction;
import dev.nymann.ZeroDivisionError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFractionAddition {
    @Test
    public void testEqualDenominators() {
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
    public void equalsWholeFraction() {
        var expected = new Fraction(1);
        assertEquals(expected, new Fraction(1, 2).plus(new Fraction(1, 2)));
    }

    @Test
    public void testNumerator0() {
        var actual = new Fraction(0, 1).plus(new Fraction(0, 2));
        var expected = new Fraction(0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void zeroDivisionError() {
        assertThrowsExactly(ZeroDivisionError.class, () -> {
            new Fraction(1, 0).plus(new Fraction(1, 2));
        });
    }

    @Test
    public void testNonEqualDenominators() {
        var actual = new Fraction(1, 4).plus(new Fraction(1, 2));
        var expected = new Fraction(3, 4);
        assertEquals(expected, actual);
    }
}
