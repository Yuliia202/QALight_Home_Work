package java_hw_62;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(String message) {
        super(message);
    }
}

class DuplicateOrderException extends Exception {
    public DuplicateOrderException(String message) {
        super(message);
    }
}

class InvalidOrderStatusException extends Exception {
    public InvalidOrderStatusException(String message) {
        super(message);
    }
}

class NoOrdersException extends Exception {
    public NoOrdersException(String message) {
        super(message);
    }
}