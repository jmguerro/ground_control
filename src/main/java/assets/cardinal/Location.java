package assets.cardinal;

import assets.Mars;
import assets.exceptions.MovementException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private int x = 0;

    private int y = 0;

    private Direction cardinal;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
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


}
