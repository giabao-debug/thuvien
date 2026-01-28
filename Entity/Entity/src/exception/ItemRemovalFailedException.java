package exception;

public class ItemRemovalFailedException extends Exception {
    public ItemRemovalFailedException(String message) {
        super(message);
    }
}