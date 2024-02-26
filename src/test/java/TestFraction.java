import dev.nymann.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFraction {
    @Test
    public void testSimpleFraction() {
        // 1/2 + 1/2 = 2/4 = 1/2
        Fraction a = new Fraction(1, 4);
        Fraction b = new Fraction(1, 4);
        Fraction expected = new Fraction(1, 2);
        assertEquals(expected, a.plus(b));
    }
}
