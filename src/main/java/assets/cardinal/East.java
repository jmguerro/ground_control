package assets.cardinal;

public class East implements Direction {

    private  Obstacle coordinatesObstacle
    @Override
    public Direction turnRigth() {
        return new North();
    }

    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Location moveForward() {
        return new Location(1,0);
    }

    @Override
    public Location moveBackward() {
        return new Location(-1,0);
    }


}
