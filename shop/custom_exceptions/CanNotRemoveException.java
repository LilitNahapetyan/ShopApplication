package shop.custom_exceptions;

public class CanNotRemoveException extends RuntimeException {

    public CanNotRemoveException() {
        super();
    }

    public CanNotRemoveException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "CanNotRemoveException{}";
    }
}
