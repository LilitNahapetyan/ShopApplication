package shop.custom_exceptions;

public class ProductIsNullException extends RuntimeException{
    public ProductIsNullException() {
        super();
    }

    public ProductIsNullException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ProductIsNullException";
    }
}
