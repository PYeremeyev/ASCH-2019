import org.junit.*;
import static org.junit.Assert.*;

public class HarryPotterProgramTest {

    HarryPotterHouseProgram HarryPottersHouse = new HarryPotterHouseProgram();



    @Test
    public void checkGryffindor(){
        assertEquals("bravery", HarryPottersHouse.defineHouse("gryffindor"));
    }
    @Test
    public void checkHufflepuff(){
        assertEquals("loyalty", HarryPottersHouse.defineHouse("hufflepuff"));
    }
    @Test
    public void checkSlytherin(){
        assertEquals("cunning", HarryPottersHouse.defineHouse("slytherin"));
    }
    @Test
    public void checkRavenclaw(){
        assertEquals("intellect", HarryPottersHouse.defineHouse("ravenclaw"));
    }
    @Test
    public void checkDefault(){
        assertEquals("not a valid house", HarryPottersHouse.defineHouse("something"));
    }
    @Test(expected=NullPointerException.class)
    public void checkNull(){
        assertEquals("Null Pointer Exception", HarryPottersHouse.defineHouse(null));
    }




















}
