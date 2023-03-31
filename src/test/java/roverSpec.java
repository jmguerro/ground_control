import assets.cardinal.Cardinal;
import assets.cardinal.Location;
import assets.cardinal.North;
import assets.cardinal.South;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class roverSpec {

    @Test
    void exampleTest() {
    String cardinal = new North().getClass().getSimpleName();
       // Location location = new Location(0,0,cardinal);
        cardinal.getClass().getSimpleName();
        //Then


        //Given
        assertEquals("North", cardinal);
        //assertEquals(0,cardinal);
        //When

    }


    @Test
    void exampleTest2() {
        String cardinal = new North().getClass().getSimpleName();
        //Location location = new Location(0,0,cardinal);
        cardinal.getClass().getSimpleName();
        //Then


        //Given
        assertEquals(new North().getClass().getSimpleName(), cardinal);
        //assertEquals(0,cardinal);
        //When

    }



}
