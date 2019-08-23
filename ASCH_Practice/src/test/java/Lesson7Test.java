import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Lesson7Test {

    @Test
    public void checkPositive() {
        assertEquals("+", Lesson7.checkPositiveNegativeZero(1));
    }


    @Test
    public void checkNegative() {
        assertEquals("-", Lesson7.checkPositiveNegativeZero(-1));
    }

    @Test
    public void checkZero() {
        assertEquals("zero", Lesson7.checkPositiveNegativeZero(0));
    }

}



