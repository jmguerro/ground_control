package assets.cardinal;

public class West implements Direction {
    @Override
    public Direction turnRigth() {
        return new South();
    }

    @Override
    public  Direction turnLeft() {
        return new North();
    }

    @Override
    public Location moveForward() {
        return new Location(-1,0);
    }
    @Override
    public Location moveBackward() {
        return new Location(1,0);
    }


}
