import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
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

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", "  ", "\t", "\n"})
    void checkEmptyAndNullStrings(String input) {
        assertEquals("not a valid house",HarryPottersHouse.defineHouse(input));
    }


    @AfterAll
    public static void clearMemory(){
        HarryPottersHouse = null;
    }


}
