package chapter04.exercise;

import java.util.ArrayList;

import static util.InputUtil.scanner;

public class PhoneManager {
    static ArrayList<NewPhone> newPhones;
    static ArrayList<OldPhone> oldPhones;

    static {
        newPhones = new ArrayList<>();
        newPhones.add(new NewPhone("NP001", "iPhone17Promax", 2000, 12, "Apple", 10));
        newPhones.add(new NewPhone("NP002", "iPhone16Pro", 1000, 12, "Apple", 10));

        oldPhones = new ArrayList<>();
        oldPhones.add(new OldPhone("OP001", "iPhone15Promax", 500, 6, "Apple", 80, "New phone"));
        oldPhones.add(new OldPhone("OP002", "iPhone14Promax", 400, 4, "Apple", 70, "Old phone"));
    }


    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.run();
    }

    //======VIEW=============
    public void viewAll() {
        viewNewPhones();
        viewOldPhones();
    }

    public void viewOldPhones() {
        if(oldPhones.isEmpty()) {
            System.out.println("No old phones");
        } else {
            System.out.println("=== List old phones ===");
            System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n", "ID", "Phone Name", "Phone Price", "Warranty Months", "Manufacturer", "Battery Condition", "Description");
            for(OldPhone oldPhone : oldPhones) {
                oldPhone.display();
            }
        }
    }

    public void viewNewPhones() {
        if(newPhones.isEmpty()) {
            System.out.println("No new phones");
        } else {
            System.out.println("=== List new phones ===");
            System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n", "ID", "Phone Name", "Phone Price", "Warranty Months", "Manufacturer", "Quantity");
            for(NewPhone newPhone : newPhones) {
                newPhone.display();
            }
        }
    }

    //======ADD=========
    public void addOldPhones() {
        System.out.println("--------ADD OLD PHONE--------");
        OldPhone oPhone = new OldPhone();
        oPhone.input(scanner);
        oPhone.setId(generateId("OP", oldPhones));
        oldPhones.add(oPhone);
        System.out.println("\nAdded successfully! Phone ID: " + oPhone.getId());
    }

    public void addNewPhones() {
        System.out.println("--------ADD NEW PHONE--------");
        NewPhone nPhone = new NewPhone();
        nPhone.input(scanner);
        newPhones.add(nPhone);
        nPhone.setId(generateId("NP", newPhones));
        System.out.println("\nAdded successfully! Phone ID: " + nPhone.getId());

    }

    //======UPDATE===========
    public void updatePhone() {


    }

    //=======DELETE==========
    public void deletePhone() {


    }

    //helper
    private String generateId(String type, ArrayList<?> list){
        return String.format("%s%03d", type, list.size() + 1); //return without printing the result
    }
}
