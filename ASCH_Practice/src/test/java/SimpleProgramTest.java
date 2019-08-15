import org.junit.*;
import static org.junit.Assert.*;


public class SimpleProgramTest {

    @Test
    public void inputBack(){
        assertEquals(10, SimpleProgram.returnInteger(10));
    }
}
