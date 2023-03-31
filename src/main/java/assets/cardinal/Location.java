package assets.cardinal;

import assets.Mars;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private int x = 0;

    private int y = 0;

    private Direction cardinal;

    private List<Obstacle> coordinatesObstacle = new ArrayList<>();

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Location(int x, int y, Direction cardinal) {
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    public void limitAxisX() {

        if (getX() > Mars.MAX_AXIS_X) {
            setX(0);
        } else if (getX() < Mars.MIN_AXIS_X) {
            setX(9);
        }


    }

    public void limitAxisY() {

        if (getY() > Mars.MAX_AXIS_Y) {
            setY(0);
        } else if (getY() < Mars.MIN_AXIS_Y) {
            setY(9);
        }


    }


    public void fordward() {


        x += cardinal.moveForward().getX();

        y += cardinal.moveForward().getY();
        limitAxisX();
        limitAxisY();
    }

    public void backwards() {


        x += cardinal.moveBackward().getX();

        y += cardinal.moveBackward().getY();
        limitAxisX();
        limitAxisY();
    }

    //manera procedural antigua precambio a poli
/*
    public void backwards() {


        switch (cardinal.getClass().getSimpleName()) {
            case "South" -> setY(getY() + 1);
            case "North" -> setY(getY() - 1);
            case "West" -> setX(getX() + 1);
            case "East" -> setX(getX() - 1);
            default -> throw new MovementException("Invalid cardinal direction");
        }
        limitAxisX();
        limitAxisY();

    }

*/
    public void turnleft() {
        cardinal = cardinal.turnLeft();
    }


    public void turnRigth() {
        cardinal = cardinal.turnRigth();
    }


    public void createObstacle() {

        Random random = new Random();
        int randomNumberX = random.nextInt(10);
        int randomNumberY = random.nextInt(10);
        int i = 0;
        coordinatesObstacle.add(i, new Obstacle(randomNumberX, randomNumberY));


    }

    public void howManyObstacle() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            int randomNumberX = random.nextInt(5);
            if (randomNumberX == 1) {

                createObstacle();

            }
        }

    }


    public void sonarObstacle() {
        System.out.println("Scanning");
        System.out.println("----------------");
        for (Obstacle i : coordinatesObstacle) {
            System.out.println("Position X: " + i.getObstacleX() + " " + "Position Y : " + i.getObstacleY());
        }
    }
}
