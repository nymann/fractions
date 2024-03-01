import dev.nymann.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReduceFraction {
    @Test
    void testSimpleReduce() {
        var expected = new Fraction(2, 3);
        var actual = new Fraction(18, 27);
        assertEquals(expected, actual);
    }
}
