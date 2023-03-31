package assets.cardinal;

public interface Direction {
    Direction turnRigth();

    Direction turnLeft();

    Location moveForward();

    Location moveBackward();
}
