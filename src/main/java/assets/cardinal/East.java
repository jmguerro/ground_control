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

        location.fordward();
    }

    @Override
    void backwards(Location location) {
        location.backwards();
    }
}
