package chapter04.exercise;

import java.util.ArrayList;

import static util.InputUtil.scanner;

public class PhoneManager {
    static ArrayList<Phone> phones;


    static {
        phones = new ArrayList<>();
        phones.add(new NewPhone("NP001", "iPhone17Promax", 2000, 12, "Apple", 10));
        phones.add(new NewPhone("NP002", "iPhone16Pro", 1000, 12, "Apple", 10));
        phones.add(new OldPhone("OP001", "iPhone15Promax", 500, 6, "Apple", 80, "New phone"));
        phones.add(new OldPhone("OP002", "iPhone14Promax", 400, 4, "Apple", 70, "Old phone"));
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
        boolean found = false;
        System.out.println("=== List old phones ===");
        System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                "ID", "Phone Name", "Phone Price", "Warranty Months", "Manufacturer", "Battery Condition", "Description");
        for (Phone p : phones) {
            if (p instanceof OldPhone) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No old phones");
        }
    }

    public void viewNewPhones() {
        boolean found = false;
        System.out.println("=== List new phones ===");
        System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                "ID", "Phone Name", "Phone Price", "Warranty Months", "Manufacturer", "Quantity");
        for (Phone p : phones) {
            if (p instanceof NewPhone) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No new phones");
        }
    }

    //======ADD=========
    public void addOldPhones() {
        System.out.println("--------ADD OLD PHONE--------");
        OldPhone oPhone = new OldPhone();
        oPhone.input(scanner);
        int count = 0;
        for (Phone p : phones) {
            if (p.getId().substring(0,2).equals("OP")) {
                count++;
            }
        }
        oPhone.setId(generateId("OP", count));
        phones.add(oPhone);
        System.out.println("\nAdded successfully! Phone ID: " + oPhone.getId());
    }

    public void addNewPhones() {
        System.out.println("--------ADD NEW PHONE--------");
        NewPhone nPhone = new NewPhone();
        nPhone.input(scanner);
        int count = 0;
        for (Phone p : phones) {
            if (p.getId().substring(0,2).equals("NP")){
                count++;
            }
        }
        nPhone.setId(generateId("NP", count));
        phones.add(nPhone);
        System.out.println("\nAdded successfully! Phone ID: " + nPhone.getId());

    }

    //======UPDATE===========
    public void updatePhone() {
        System.out.print("\nEnter phone ID to update: ");
        String id = scanner.nextLine().trim().toUpperCase();

        if (!isValidId(id)) {
            System.out.println("  Invalid ID. Must be NPXXX or OPXXX (for example NP001).");
            return;
        }

        for (Phone p : phones) {
            if (p.getId().equals(id)) {
                System.out.println("  Found. Enter new information:");
                p.input(scanner);
                p.setId(id);
                System.out.println("  Update successful.");
                return;
            }
        }
        System.out.println("  ID does not exist.");
    }

    //=======DELETE==========
    public void deletePhone() {
        System.out.print("\nEnter phone ID to delete: ");
        String id = scanner.nextLine().trim().toUpperCase();

        if (!isValidId(id)) {
            System.out.println("Invalid ID. Must be NPXXX or OPXXX (for example OP001).");
            return;
        }
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId().equals(id)) {
                System.out.println("Phone to delete:");
                phones.get(i).display();
                System.out.print("Are you sure (yes/no)?: ");
                String confirm = scanner.nextLine().trim();
                if (confirm.equals("yes")) {
                    phones.remove(i);
                    System.out.println("Deleted successfully.");
                } else {
                    System.out.println("Cancelled.");
                }
                return;
            }
        }

        System.out.println("ID does not exist.");
    }
    //==========SORT========================
    public void sortByPriceAscending() {
        for (int i = 0; i < phones.size() - 1; i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPhonePrice() > phones.get(j).getPhonePrice()) {
                    Phone temp = phones.get(i);
                    phones.set(i, phones.get(j)); //arr[i] = arr[j];
                    phones.set(j, temp);
                }
            }
        }
        System.out.println("Sorted by price ascending:");
        viewAll();
    }

    public void sortByPriceDescending() {
        // Interchange sort
        for (int i = 0; i < phones.size() - 1; i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPhonePrice() < phones.get(j).getPhonePrice()) {
                    Phone temp = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, temp);
                }
            }
        }
        System.out.println("Sorted by price descending:");
        viewAll();
    }

    // ======SEARCH==========
    public void searchByPriceRange() {
        System.out.print("Enter minimum price: ");
        double minPrice = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter maximum price: ");
        double maxPrice = Double.parseDouble(scanner.nextLine().trim());

        boolean found = false;
        System.out.println("=== Results ===");
        for (Phone p : phones) {
            if (p.getPhonePrice() >= minPrice && p.getPhonePrice() <= maxPrice) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No phones found in that price range.");
        }
    }

    public void searchByName() {
        System.out.print("Enter phone name to search: ");
        String keyword = scanner.nextLine().trim().toLowerCase();

        boolean found = false;
        System.out.println("=== Results ===");
        for (Phone p : phones) {
            if (p.getPhoneName().toLowerCase().contains(keyword)) {
                p.display();
                found = true;
            }
        }
        if (!found) System.out.println("No phones found with that name.");
    }

    public void searchByType(String type) {
        System.out.println("\n=== Results ===");
        boolean found = false;

        for (Phone p : phones) {
            if (type.equals("old") && p instanceof OldPhone) {
                p.display();
                found = true;
            } else if (type.equals("new") && p instanceof NewPhone) {
                p.display();
                found = true;
            }
        }

        if (!found) System.out.println("  No phones found.");
        }
        //helper
        private String generateId(String type, int size){
            return String.format("%s%03d", type, size + 1); //return without printing the result
        }

        private boolean isValidId(String id) {
            if (id == null || id.length() != 5) {
                return false;
            } else if (!id.startsWith("NP") && !id.startsWith("OP")) {
                return false;
            }
            return true;
        }
    }







