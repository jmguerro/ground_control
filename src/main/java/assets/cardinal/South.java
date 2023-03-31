package assets.cardinal;

public class South extends Direction {
    @Override
    Direction turnRigth() {

        return new East();
    }

    @Override
    Direction turnLeft() {
        return new West();
    }

}
