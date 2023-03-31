package assets.cardinal;

import assets.Mars;
import assets.exceptions.MovementException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private int x = 0;

    private int y = 0;

    private Cardinal cardinal;


    public void limitAxisX() {

        if (getX() > Mars.MAX_AXIS_X) {
            setX(0);
        }else if (getX() < Mars.MIN_AXIS_X){
            setX(9);
        }


    }

    public void limitAxisY() {

        if (getY() > Mars.MAX_AXIS_Y) {
            setY(0);
        }else if (getY() < Mars.MIN_AXIS_Y){
            setY(9);
        }


    }



    public void fordward() {


        switch (cardinal.getClass().getSimpleName()) {
            case "South" -> setY(getY() - 1);
            case "North" -> setY(getY() + 1);
            case "West" -> setX(getX() - 1);
            case "East" -> setX(getX() + 1);
            default -> throw new MovementException("Invalid cardinal direction");
        }
        limitAxisX();
        limitAxisY();
        }

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




}
