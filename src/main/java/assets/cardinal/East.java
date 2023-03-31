package assets.cardinal;

public class East extends Cardinal {
    @Override
    Cardinal turnRigth() {
        return new North();
    }

    @Override
    Cardinal turnLeft() {
        return new South();
    }

    @Override
    void forwards(Location location) {

        if (getClass() == East.class) {
            int x = location.getX();
            int y = location.getY() + 1;
            location.setX(x);
            location.setY(y);
        }
    }

    @Override
    void backwards(Location location) {
        if (getClass() == East.class) {
            int x = location.getX();
            int y = location.getY() - 1;
            location.setX(x);
            location.setY(y);
        }
    }
}
