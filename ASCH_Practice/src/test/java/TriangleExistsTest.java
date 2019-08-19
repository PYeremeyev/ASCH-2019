import org.junit.*;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class TriangleExistsTest {

    TriangleExists t = new TriangleExists();


    @Test
    public void checkIfTriangleExists() {
        assertEquals("Yes", t.triangleExists(2, 2, 3));
    }

    @Test
    public void checkFirstNumberHigh() {
        assertEquals("No", t.triangleExists(10, 2, 3));
    }

    @Test
    public void checkSecondNumberHigh() {
        assertEquals("No", t.triangleExists(2, 10, 3));
    }

    @Test
    public void checkThirdNumberHigh() {
        assertEquals("No", t.triangleExists(2, 2, 10));
    }

}