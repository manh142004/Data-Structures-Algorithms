package StudentManagement;

// Custom exception class
public class DuplicateIDException extends RuntimeException {
    public DuplicateIDException(String message) {
        super(message);
    }
}
