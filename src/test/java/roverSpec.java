import assets.cardinal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class roverSpec {
/*
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

*/



    @Test
    void forwardFromNorth() {

        //Then
        Location location = new Location(5,5,new North());
        //Given
        location.fordward();
        //When
        assertEquals(5,location.getX());
        assertEquals(6,location.getY());

    }


    @Test
    void forwardFromWest() {

        //Then
        Location location = new Location(5,5,new West());
        //Given
        location.fordward();
        //When
        assertEquals(4,location.getX());
        assertEquals(5,location.getY());

    }


    @Test
    void forwardFromSouth() {

        //Then
        Location location = new Location(5,5,new South());
        //Given
        location.fordward();
        //When
        assertEquals(5,location.getX());
        assertEquals(4,location.getY());
        assertEquals("South",location.getCardinal().getClass().getSimpleName());
    }


    @Test
    void forwardFromEast() {

        //Then
        Location location = new Location(5,5,new East());
        //Given
        location.fordward();
        //When
        assertEquals(6,location.getX());
        assertEquals(5,location.getY());

    }



    @Test
    void limitFromEast() {

        //Then
        Location location = new Location(9,9,new East());
        //Given
        location.fordward();
        //When
        assertEquals(0,location.getX());
        assertEquals(9,location.getY());

    }

    @Test
    void limitFromNorth() {

        //Then
        Location location = new Location(9,9,new North());
        //Given
        location.fordward();
        //When
        assertEquals(9,location.getX());
        assertEquals(0,location.getY());

    }

    @Test
    void limitFromSouth() {

        //Then
        Location location = new Location(9,9,new South());
        //Given
        location.backwards();
        //When
        assertEquals(9,location.getX());
        assertEquals(0,location.getY());

    }
    @Test
    void limitFromWest() {

        //Then
        Location location = new Location(9,9,new West());
        //Given
        location.backwards();
        //When
        assertEquals(0,location.getX());
        assertEquals(9,location.getY());

    }

    @Test
    void turnLeftFromNort() {

        //Then
        Location location = new Location(9,9,new North());

        //Given
        location.turnleft();
        location.getCardinal();
        //When
        assertEquals("West",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnLeftFromWest() {

        //Then
        Location location = new Location(9,9,new West());

        //Given
        location.turnleft();
        location.getCardinal();
        //When
        assertEquals("North",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnLeftFromSouth() {

        //Then
        Location location = new Location(9,9,new South());

        //Given
        location.turnleft();
        location.getCardinal();
        //When
        assertEquals("West",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnLeftFromEast() {

        //Then
        Location location = new Location(9,9,new East());

        //Given
        location.turnleft();
        location.getCardinal();
        //When
        assertEquals("South",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnRigthFromNort() {

        //Then
        Location location = new Location(9,9,new North());

        //Given
        location.turnRigth();
        location.getCardinal();
        //When
        assertEquals("East",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnRigthFromWest() {

        //Then
        Location location = new Location(9,9,new West());

        //Given
        location.turnRigth();
        location.getCardinal();
        //When
        assertEquals("South",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnRigthFromSouth() {

        //Then
        Location location = new Location(9,9,new South());

        //Given
        location.turnRigth();
        location.getCardinal();
        //When
        assertEquals("East",location.getCardinal().getClass().getSimpleName());


    }

    @Test
    void turnRigthFromEast() {

        //Then
        Location location = new Location(9,9,new East());

        //Given
        location.turnRigth();
        location.getCardinal();
        //When
        assertEquals("North",location.getCardinal().getClass().getSimpleName());


    }
/*
    @Test
    void exampleTest3() {


        Location location = new Location(9,9,new East());

        location.fordward();
        //Given
        assertEquals("xq", location);
        //assertEquals(0,cardinal);
        //When

    }

*/
}
