package assets.cardinal;

public class East extends Direction {
    @Override
    Direction turnRigth() {
        return new North();
    }

    @Override
    Direction turnLeft() {
        return new South();
    }

}
