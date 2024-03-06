package one.digitalinnovation.exception;

public class InformationNotFoundException extends RuntimeException {
    public InformationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public InformationNotFoundException(String message) {
        super(message);
    }
}
