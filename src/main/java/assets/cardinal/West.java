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
        location.fordward();
    }

    @Override
    void backwards(Location location) {
        location.backwards();
    }
}
