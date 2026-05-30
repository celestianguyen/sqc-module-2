package chapter04.exercise;

import chapter04.exercise.exception.EmptyFieldException;
import chapter04.exercise.exception.MinLengthException;
import chapter04.exercise.exception.NegativeNumberException;
import chapter04.exercise.exception.NumberOutOfRangeException;
import chapter04.exercise.validation.CommonValidation;
import chapter04.exercise.validation.PhoneValidation;

import java.util.Scanner;

/**
 * Old phones include:
 * + Battery condition (remaining percentage)
 * + Additional description
 */
public class OldPhone extends Phone {
    private int batteryCondition;
    private String description;

    //constructors
    public OldPhone() {
    }

    public OldPhone(String id, String phoneName, double phonePrice, int warrantyMonths, String manufacturer, int batteryCondition, String description) {
        super(id, phoneName, phonePrice, warrantyMonths, manufacturer);
        this.batteryCondition = batteryCondition;
        this.description = description;
    }

    @Override
    public void input(Scanner sc) throws EmptyFieldException, NumberFormatException,
            NegativeNumberException, NumberOutOfRangeException, MinLengthException {
        super.input(sc);

        System.out.print("  Battery condition (%): ");
        String batteryStr = sc.nextLine().trim();
        int battery = CommonValidation.parseInt(batteryStr, "Battery condition");
        PhoneValidation.checkBatteryRange(battery);
        this.batteryCondition = battery;

        System.out.print("  Description: ");
        String desc = sc.nextLine().trim();
        CommonValidation.checkNotEmpty(desc, "Description");
        PhoneValidation.checkDescriptionLength(desc);
        this.description = desc;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %-20s | %-20s\n", batteryCondition, description);
    }

    //getters
    public int getBatteryCondition() {
        return batteryCondition;
    }

    public String getDescription() {
        return description;
    }

    //setters
    public void setBatteryCondition(int batteryCondition) {
        if (batteryCondition < 0 || batteryCondition > 100) {
            System.out.println("Invalid input. Battery condition must be within 0-100%.");
        } else {
            this.batteryCondition = batteryCondition;
        }
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Invalid input. Manufacturer cannot be null or empty.");
        } else {
            this.description = description;
        }
    }


}
