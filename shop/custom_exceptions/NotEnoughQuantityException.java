package shop.custom_exceptions;

public class NotEnoughQuantityException extends RuntimeException{
    public NotEnoughQuantityException() {
        super();
    }

    public NotEnoughQuantityException(String message) {
        super(message);
    }
}
