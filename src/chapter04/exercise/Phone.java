package chapter04.exercise;

import chapter04.exercise.exception.EmptyFieldException;
import chapter04.exercise.exception.MinLengthException;
import chapter04.exercise.exception.NegativeNumberException;
import chapter04.exercise.exception.NumberOutOfRangeException;
import chapter04.exercise.validation.CommonValidation;

import java.util.Scanner;

/**
 * All phones have the following information:
 * + id
 * + Phone name
 * + Selling price
 * + Warranty period
 * + Manufacturer (e.g. iPhone, Samsung, …)
 */
public class Phone {
    protected String id;
    protected String phoneName;
    protected double phonePrice;
    protected int warrantyMonths;
    protected String manufacturer;

    public Phone() {
    }

    public Phone(String id, String phoneName, double phonePrice, int warrantyMonths, String manufacturer) {
        this.id = id;
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
        this.warrantyMonths = warrantyMonths;
        this.manufacturer = manufacturer;
    }

    // To be implemented by subclasses
    public void input(Scanner sc) throws EmptyFieldException, NumberFormatException,
            NegativeNumberException, NumberOutOfRangeException, MinLengthException {
        System.out.print("  Name: ");
        String name = sc.nextLine().trim();
        CommonValidation.checkNotEmpty(name, "Phone name");
        this.phoneName = name;

        System.out.print("  Price (USD): ");
        String priceStr = sc.nextLine().trim();
        double price = CommonValidation.parseDouble(priceStr, "Price"); //throws EmptyField or NumberFormat
        CommonValidation.checkNotNegative(price, "Price");
        this.phonePrice = price;

        System.out.print("  Warranty (months): ");
        String warrantyStr = sc.nextLine().trim();
        int warranty = CommonValidation.parseInt(warrantyStr, "Warranty period");
        CommonValidation.checkNotNegative(warranty, "Warranty period");
        this.warrantyMonths = warranty;

        System.out.print("  Manufacturer: ");
        String mfr = sc.nextLine().trim();
        CommonValidation.checkNotEmpty(mfr, "Manufacturer");
        this.manufacturer = mfr;
    }

    public void display() {
        System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s ", id, phoneName, phonePrice, warrantyMonths, manufacturer);

//        System.out.println("Phone name: " + phoneName);
//        System.out.println("Phone Price: " + phonePrice);
//        System.out.println("Warranty Months: " + warrantyMonths);
//        System.out.println("Manufacturer: " + manufacturer);
    }

    //getters
    public String getId() {
        return id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setPhoneName(String phoneName) {
        if (phoneName == null || phoneName.trim().isEmpty()) {
            System.out.println("Invalid input. Phone name cannot be null or empty.");
        } else {
            this.phoneName = phoneName;
        }
    }

    public void setPhonePrice(double phonePrice) {
        if (phonePrice < 0) {
            System.out.println("Invalid input. Price cannot be less than 0.");
        }
        this.phonePrice = phonePrice;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        if (warrantyMonths < 0) {
            System.out.println("Invalid input. Warranty months cannot be less than 0.");
        }
        this.warrantyMonths = warrantyMonths;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.trim().isEmpty()) {
            System.out.println("Invalid input. Manufacturer cannot be null or empty.");
        } else {
            this.manufacturer = manufacturer;
        }
    }
}
