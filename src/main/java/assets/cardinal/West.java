package assets.cardinal;

public class West extends Cardinal {
    @Override
    Cardinal turnRigth() {
        return new South();
    }

    @Override
    Cardinal turnLeft() {
        return new North();
    }

    @Override
    void forwards(Location location) {
        if (getClass() == West.class) {
            int x = location.getX();
            int y = location.getY() - 1;
            location.setX(x);
            location.setY(y);
        }
    }

    @Override
    void backwards(Location location) {
        if (getClass() == West.class) {
            int x = location.getX();
            int y = location.getY() + 1;
            location.setX(x);
            location.setY(y);
        }
    }
}
