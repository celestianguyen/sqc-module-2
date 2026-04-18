package chapter04.exercise;

import util.InputUtil;

/**
 * --- MOBILE PHONE MANAGEMENT PROGRAM ---
 * <p>
 * 1. View phone list //
 * 2. Add new phone
 * 3. Update phone
 * 4. Delete phone
 * 5. Sort by price
 * 6. Search 7. Calculate total price
 * 8. Discount for old phones
 * 9. Exit
 * <p>
 * Choose a function (number):
 * Sub-menu I //
 * - View phone list
 * 1. View all phones
 * 2. View old phones
 * 3. View new phones
 * 4. Back to main menu
 * <p>
 * Sub-menu II //
 * - Add new phone
 * 1. Add old phone
 * 2. Add new phone
 * 3. Back to main menu
 * <p>
 * Sub-menu III
 * - Sort by price
 * 1. Ascending
 * 2. Descending
 * 3. Back to main menu
 * <p>
 * Sub-menu IV
 * - Search
 * 1. Search all phones
 * 2. Search old phones
 * 3. Search new phones
 * 4. Back to main menu
 * <p>
 * Sub-menu V
 * When choosing 1, 2, or 3, show:
 * <p>
 * 1. Search by price range
 * 2. Search by name
 * 3. Search by manufacturer
 * 4. Back to search menu
 * <p>
 * - Exit
 * End the program.
 */
public class Menu {
    private PhoneManager manager;

    //called by main
    public void run() {
        int choice = 0;
        do {
            printMainMenu();
            choice = InputUtil.readInt("Choose a function (number)");
            switch (choice) {
                case 1 -> viewPhoneMenu();
                case 2 -> viewAddMenu();
                case 3 -> manager.updatePhone();
                case 4 -> manager.deletePhone();
                case 5 -> System.out.println("Sorting... (to be updated)");
                case 6 -> System.out.println("Searching...(to be updated)");
                case 7 -> System.out.println("Calculating...(to be updated)");
                case 8 -> System.out.println("Discounting...(to be updated)");
                case 9 -> System.out.println("Farewell my hooman.");
                default -> System.out.println("Invalid choice! Please enter 1-9.");
            }
        } while (choice != 9);

    }

    //print main menu
    public void printMainMenu() {
        System.out.println("--- MOBILE PHONE MANAGEMENT PROGRAM ---\n");
        System.out.println("1. View phone list");
        System.out.println("2. Add new phone");
        System.out.println("3. Update phone");
        System.out.println("4. Delete phone");
        System.out.println("5. Sort by price");
        System.out.println("6. Search");
        System.out.println("7. Calculate total price");
        System.out.println("8. Discount for old phones");
        System.out.println("9. Exit");
    }

    //sub-menu I
    public void viewPhoneMenu() {
        int choice = 0;
        do {
            System.out.println("\n1. View all phones");
            System.out.println("2. View old phones");
            System.out.println("3. View new phones");
            System.out.println("4. Back to main menu");
            choice = InputUtil.readInt("Your choice: ");

            switch (choice){
                case 1 -> manager.viewAll();
                case 2 -> manager.viewOldPhones();
                case 3 -> manager.viewNewPhones();
                case 4 -> {}
                default -> System.out.println("Invalid choice! Please enter 1-4.");
            }
        } while (choice != 4);
    }

    //sub-menu II
    public void viewAddMenu() {
        int choice = 0;
        do {
            System.out.println("\n1. Add old phone");
            System.out.println("2. Add new phone");
            System.out.println("3. Back to main menu");
            choice = InputUtil.readInt("Your choice: ");

            switch (choice){
                case 1 -> manager.addOldPhones();
                case 2 -> manager.addNewPhones();
                case 3 -> {}
                default -> System.out.println("Invalid choice! Please enter 1-3.");
            }
        } while (choice != 3);
    }


}
