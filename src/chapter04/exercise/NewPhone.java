package chapter04.exercise;

import chapter04.exercise.exception.EmptyFieldException;
import chapter04.exercise.exception.MinLengthException;
import chapter04.exercise.exception.NegativeNumberException;
import chapter04.exercise.exception.NumberOutOfRangeException;
import chapter04.exercise.validation.CommonValidation;

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
    public void input(Scanner sc) throws EmptyFieldException, NumberFormatException,
            NegativeNumberException, NumberOutOfRangeException, MinLengthException {
        super.input(sc);

        System.out.print("  Quantity: ");
        String qtyStr = sc.nextLine().trim();
        int qty = CommonValidation.parseInt(qtyStr, "Quantity");
        CommonValidation.checkNotNegative(qty, "Quantity");
        this.quantity = qty;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" | %-20s\n", quantity);
    }
}
