package shop.custom_exceptions;

public class ThereIsNotSuchProductException extends RuntimeException{
    public ThereIsNotSuchProductException() {
        super();
    }

    public ThereIsNotSuchProductException(String message) {
        super(message);
    }
}
