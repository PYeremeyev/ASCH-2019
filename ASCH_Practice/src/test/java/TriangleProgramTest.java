import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleProgramTest {

    TriangleProgram triangleExists = new TriangleProgram();

    @Test
    public void checkZeros() {
        assertEquals("No", triangleExists.triangle(0, 0, 0));
    }

    @Test
    public void checkIfTriangleExists() {
        assertEquals("Yes", triangleExists.triangle(2, 2, 3));
    }

    @Test
    public void checkFirstNumberHigh() {
        assertEquals("No", triangleExists.triangle(10, 2, 3));
    }

    @Test
    public void checkSecondNumberHigh() {
        assertEquals("No", triangleExists.triangle(2, 10, 3));
    }

    @Test
    public void checkThirdNumberHigh() {
        assertEquals("No", triangleExists.triangle(2, 2, 10));
    }


}