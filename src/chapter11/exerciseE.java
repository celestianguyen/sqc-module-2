package chapter11;

import java.io.File;
import java.util.Scanner;

/**
 * e. Write a program to delete a given file or directory.
 */
public class exerciseE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path to delete: ");
        String path = sc.nextLine();

        File f = new File(path);

        if (!f.exists()) {
            System.out.println("File or directory not found.");
            return;
        }

        boolean deleted = f.delete();

        if (deleted) {
            System.out.println("Deleted successfully.");
        } else {
            System.out.println("Could not delete. Make sure it is empty if it is a directory.");
        }
    }
}
