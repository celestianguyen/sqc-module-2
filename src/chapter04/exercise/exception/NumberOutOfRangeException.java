package chapter04.exercise.exception;

public class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String fieldName, int min, int max) {
        super("\"" + fieldName + "\" must be between " + min + " and " + max + ".");
    }

}
