package chapter04.exercise.exception;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String fieldName) {
        super("\"" + fieldName + "\" cannot be a negative number.");
    }
}
