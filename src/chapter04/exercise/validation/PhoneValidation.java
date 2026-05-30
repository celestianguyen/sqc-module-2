package chapter04.exercise.validation;

import chapter04.exercise.exception.MinLengthException;
import chapter04.exercise.exception.NumberOutOfRangeException;

public class PhoneValidation {
    private static final int DESCRIPTION_MIN_LENGTH = 10;
    private static final int BATTERY_MIN = 0;
    private static final int BATTERY_MAX = 100;

    // Battery must be 0–100
    public static void checkBatteryRange(int battery) throws NumberOutOfRangeException {
        if (battery < BATTERY_MIN || battery > BATTERY_MAX) {
            throw new NumberOutOfRangeException("Battery condition", BATTERY_MIN, BATTERY_MAX);
        }
    }

    // Description must be at least 10 characters
    public static void checkDescriptionLength(String description) throws MinLengthException {
        if (description == null || description.trim().length() < DESCRIPTION_MIN_LENGTH) {
            throw new MinLengthException("Description", DESCRIPTION_MIN_LENGTH);
        }
    }
}
