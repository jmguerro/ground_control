package assets.cardinal;

public class North extends Direction {
    @Override
    Direction turnRigth() {
        return new East();
    }

    @Override
    Direction turnLeft() {
        return new West();
    }

}
