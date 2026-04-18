package chapter04.exercise;

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
    protected int id;
    protected String phoneName;
    protected double phonePrice;
    protected int warrantyMonths;
    protected String manufacturer;

    public Phone() {

    }

    public Phone(int id, String phoneName, double phonePrice, int warrantyMonths, String manufacturer) {
        this.id = id;
        setPhonePrice(phonePrice);
        setPhoneName(phoneName);
        setWarrantyMonths(warrantyMonths);
        setManufacturer(manufacturer);
    }

    //getters
    public int getId() {
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
    public void setId(int id) {
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

    // To be implemented by subclasses
    public void input(Scanner sc){

    }
    public void display(){

    }
}
