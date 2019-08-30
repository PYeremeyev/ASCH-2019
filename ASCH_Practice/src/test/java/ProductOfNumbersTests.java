import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductOfNumbersTests {

    static ProductOfNumbers ProductNumbers;

    @BeforeAll
    public static void init() {
        ProductNumbers = new ProductOfNumbers();
    }

    @Test
    public void productOfNumbersSmall() {
        assertEquals(1, ProductNumbers.productOfInput(1, 2));
    }

    @Test
    public void productOfNumbersBig() {
        assertEquals(11035502400.0, ProductNumbers.productOfInput(100, 105));
    }

    @Test
    public void productOfNumbersZero() {
        assertEquals(0, ProductNumbers.productOfInput(0, 1));
    }

    @Test
    public void productOfNumbersMaximumInt() {
        assertEquals(0, ProductNumbers.productOfInput(1, 999999999));
    }


    @AfterAll
    public static void clearMemory() {
        ProductNumbers = null;
    }


}