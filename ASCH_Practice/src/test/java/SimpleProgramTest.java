import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleProgramTest {

    @Test
    public void inputBack(){
        assertEquals(10, SimpleProgram.returnInteger(10));
    }
}
