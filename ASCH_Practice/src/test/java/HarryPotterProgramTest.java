import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class HarryPotterProgramTest {

  static HarryPotterHouseProgram HarryPottersHouse;

    @BeforeAll
    public static void init(){
        HarryPottersHouse = new HarryPotterHouseProgram();
    }


    @Test
    public void checkGryffindor() {
        assertEquals("bravery", HarryPottersHouse.defineHouse("gryffindor"));
    }

    @Test
    public void checkHufflepuff() {
        assertEquals("loyalty", HarryPottersHouse.defineHouse("hufflepuff"));
    }

    @Test
    public void checkSlytherin() {
        assertEquals("cunning", HarryPottersHouse.defineHouse("slytherin"));
    }

    @Test
    public void checkRavenclaw() {
        assertEquals("intellect", HarryPottersHouse.defineHouse("ravenclaw"));
    }
    @Test
    public void checkDefault() {
        assertEquals("not a valid house", HarryPottersHouse.defineHouse("something"));
    }

    @AfterAll
    public static void exit(){
        HarryPottersHouse = null;
    }

 //   @Test
  //  public void checkNull() {
  //      assertEquals("not a valid house", HarryPottersHouse.defineHouse(null));
 //   }


}
