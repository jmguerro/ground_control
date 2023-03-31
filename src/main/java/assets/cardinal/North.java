package assets.cardinal;

public class North extends Cardinal {
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

        location.fordward();

    }

    @Override
    void backwards(Location location) {
        location.backwards();
    }
}
