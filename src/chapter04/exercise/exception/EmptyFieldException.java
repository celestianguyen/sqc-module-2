package chapter04.exercise.exception;

public class EmptyFieldException extends Exception {
    public EmptyFieldException(String fieldName) {
        super("\"" + fieldName + "\" cannot be empty.");
    }
}
