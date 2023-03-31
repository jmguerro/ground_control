package assets.exceptions;

public class orderNotFoundException extends RuntimeException {

        public orderNotFoundException(String errorMessage) {
            super(errorMessage);
    }
}
