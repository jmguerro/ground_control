package assets.cardinal;

public class North extends Cardinal{
    @Override
    Cardinal turnRigth() {
        return new East();
    }

    @Override
    Cardinal turnLeft() {
        return new West();
    }

    @Override
    void forwards(Location location) {

        if (getClass() == North.class) {
            int x = location.getX() + 1;
            int y = location.getY();
            location.setX(x);
            location.setY(y);
        }


    }

    @Override
    void backwards(Location location) {
        if (getClass() == North.class) {
            int x = location.getX() -1 ;
            int y = location.getY();
            location.setX(x);
            location.setY(y);
        }
    }
}
