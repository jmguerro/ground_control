package assets.cardinal;

public class North implements Direction {
    @Override
   public Direction turnRigth() {
        return new East();
    }

    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Location moveForward() {
        return new Location(0,1);
    }

    @Override
   public Location moveBackward() {
        return new Location(0,-1);
    }


}
