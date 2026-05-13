package java_hw_63.exeptions;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(String message) {
        super(message);
    }
}

class InvalidOrderStatusException extends Exception {
    public InvalidOrderStatusException(String message) {
        super(message);
    }
}

