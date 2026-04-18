package chapter04.exercise;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    //constructors
    public NewPhone() {
    }

    public NewPhone(int id, String phoneName, int warrantyMonths, String manufacturer, int quantity) {
        super(id, phoneName, warrantyMonths, manufacturer);
        this.quantity = quantity;
    }

    //getters
    public int getQuantity() {
        return quantity;
    }

    //setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void input(Scanner sc){
        System.out.print("  Name: ");
        this.phoneName = sc.nextLine();
        System.out.print("  Price (USD): ");
        this.phonePrice = Double.parseDouble(sc.nextLine());
        System.out.print("  Warranty (months): ");
        this.warrantyMonths = Integer.parseInt(sc.nextLine());
        System.out.print("  Manufacturer: ");
        this.manufacturer = sc.nextLine();
        System.out.print("  Quantity: ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }

    //override output()
}
