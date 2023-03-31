package assets.cardinal;

import assets.Mars;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    private int x = 0;

    private int y = 0;

    private Cardinal cardinal;

    public void limitAxis() {

        if (x > Mars.MAX_AXIS_X) {
            x = 0;
        } else {
            x = 9;
        }


    }

    public void limitAxisY() {

        if (x > Mars.MAX_AXIS_X) {
            x = 0;
        } else {
            x = 9;
        }


    }


    public void fordward() {

        limitAxis();
        limitAxisY();

        if (cardinal.getClass().getSimpleName() == new South().getClass().getSimpleName()) {
            int x = getX();
            int y = getY() - 1;
            setX(x);
            setY(y);
        } else if (cardinal.getClass().getSimpleName() == new North().getClass().getSimpleName()) {
            int x = getX();
            int y = getY() + 1;
            setX(x);
            setY(y);
        } else if (cardinal.getClass().getSimpleName() == new West().getClass().getSimpleName()) {
            int x = getX() - 1;
            int y = getY();
            setX(x);
            setY(y);
        } else if (cardinal.getClass().getSimpleName() == new East().getClass().getSimpleName()) {
            int x = getX();
            int y = getY() + 1;
            setX(x);
            setY(y);
        }

    }


    public void backwards() {

        limitAxis();
        limitAxisY();

        if (cardinal.getClass().getSimpleName() == new South().getClass().getSimpleName()) {
            int x = getX();
            int y = getY() + 1;
            setX(x);
            setY(y);
        } else if (cardinal.getClass().getSimpleName() == new North().getClass().getSimpleName()) {
            int x = getX();
            int y = getY() - 1;
            setX(x);
            setY(y);
        } else if (cardinal.getClass().getSimpleName() == new West().getClass().getSimpleName()) {
            int x = getX() + 1;
            int y = getY();
            setX(x);
            setY(y);
        } else if (cardinal.getClass().getSimpleName() == new East().getClass().getSimpleName()) {
            int x = getX();
            int y = getY() - 1;
            setX(x);
            setY(y);
        }

    }
}
