import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckDayOfTheWeekTests {

    static CheckDayOfTheWeek checkDaysOfWeek;

    @BeforeAll
    public static void init() {
        checkDaysOfWeek = new CheckDayOfTheWeek();
    }
    @Test
    public void checkDays() {
        assertEquals("Monday", checkDaysOfWeek.checkDay(1));
        assertEquals("Tuesday", checkDaysOfWeek.checkDay(2));
        assertEquals("Wednesday", checkDaysOfWeek.checkDay(3));
        assertEquals("Thursday", checkDaysOfWeek.checkDay(4));
        assertEquals("Friday", checkDaysOfWeek.checkDay(5));
        assertEquals("Saturday", checkDaysOfWeek.checkDay(6));
        assertEquals("Sunday", checkDaysOfWeek.checkDay(7));
    }

    @Test
    public void invalidDay() {
        assertEquals("Please try to restart your PC", checkDaysOfWeek.checkDay(1982));

    }

    @AfterAll
    public static void clearMemory() {
        checkDaysOfWeek = null;
    }
}
