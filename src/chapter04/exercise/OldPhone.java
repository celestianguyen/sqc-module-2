package chapter04.exercise;

import java.util.Scanner;

/**
 * Old phones include:
 *      + Battery condition (remaining percentage)
 *      + Additional description
 */
public class OldPhone extends Phone {
    private int batteryCondition;
    private String description;

    //constructors
    public OldPhone() {
    }

    public OldPhone(int id, String phoneName, double phonePrice, int warrantyMonths, String manufacturer, int batteryCondition, String description) {
        super(id, phoneName, phonePrice, warrantyMonths, manufacturer);
        this.batteryCondition = batteryCondition;
        this.description = description;
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
        if (batteryCondition < 0 || batteryCondition > 100){
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

    @Override
    public void input(Scanner sc) {
        System.out.print("  Name: ");
        this.phoneName = sc.nextLine();
        System.out.print("  Price (USD): ");
        this.phonePrice = Double.parseDouble(sc.nextLine());
        System.out.print("  Warranty (months): ");
        this.warrantyMonths = Integer.parseInt(sc.nextLine());
        System.out.print("  Manufacturer: ");
        this.manufacturer = sc.nextLine();
        System.out.print("  Battery condition (%): ");
        this.batteryCondition = Integer.parseInt(sc.nextLine());
        System.out.print("  Description: ");
        this.description = sc.nextLine();
    }

    //override output()
}
