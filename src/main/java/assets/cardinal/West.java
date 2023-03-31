package assets.cardinal;

public class West extends Direction {
    @Override
    Direction turnRigth() {
        return new South();
    }

    @Override
    Direction turnLeft() {
        return new North();
    }

}
