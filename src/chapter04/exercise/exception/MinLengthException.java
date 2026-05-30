package chapter04.exercise.exception;

public class MinLengthException extends Exception {
    public MinLengthException(String fieldName, int minLength) {
        super("\"" + fieldName + "\" must be at least " + minLength + " characters long.");
    }
}
