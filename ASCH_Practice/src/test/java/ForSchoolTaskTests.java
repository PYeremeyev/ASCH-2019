import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForSchoolTaskTests {

    @Test
    public void happyPath() {
        assertEquals(5, ForSchoolTask.countTwoArrays(0, 10, 1, 7));
    }

    @Test
    public void invalidRange() {
        assertEquals(0, ForSchoolTask.countTwoArrays(0, 10, -10, -1));
    }

    @Test
    public void maximumInteger() {
        assertEquals(0, ForSchoolTask.countTwoArrays(99999999, 999999999, 999999999, 999999999));
    }


}



