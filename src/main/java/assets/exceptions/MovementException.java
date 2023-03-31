package assets.exceptions;

public class MovementException extends RuntimeException{

    public MovementException(String errorMessage) {
        super(errorMessage);
    }
}
