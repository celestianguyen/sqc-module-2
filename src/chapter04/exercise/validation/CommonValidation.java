package chapter04.exercise.validation;


import chapter04.exercise.exception.EmptyFieldException;
import chapter04.exercise.exception.NegativeNumberException;

public class CommonValidation {
    // Throws EmptyFieldException if the value is null or blank
    public static void checkNotEmpty(String value, String fieldName) throws EmptyFieldException {
        if (value == null || value.trim().isEmpty()) {
            throw new EmptyFieldException(fieldName);
        }
    }

    // Throws NegativeNumberException if the value is below 0
    public static void checkNotNegative(double value, String fieldName) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(fieldName);
        }
    }

    // Parses a String to double (NumberFormatException is Java's built-in -> let it propagate)
    public static double parseDouble(String input, String fieldName) throws EmptyFieldException, NumberFormatException {
        checkNotEmpty(input, fieldName);
        return Double.parseDouble(input); // throws NumberFormatException if not a valid number
    }

    // Parses a String to int
    public static int parseInt(String input, String fieldName) throws EmptyFieldException, NumberFormatException {
        checkNotEmpty(input, fieldName);
        return Integer.parseInt(input);
    }


}
