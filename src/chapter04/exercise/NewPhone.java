package chapter04.exercise;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    //constructors
    public NewPhone() {
    }

    public NewPhone(String id, String phoneName, double phonePrice, int warrantyMonths, String manufacturer, int quantity) {
        super(id, phoneName, phonePrice, warrantyMonths, manufacturer);
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
    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("  Quantity: ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %-20s\n", quantity);
    }
}
