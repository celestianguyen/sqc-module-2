package chapter11;

import java.io.File;
import java.util.Scanner;

/**
 * f. Write a program to rename a given file or directory.
 */
public class exerciseF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current name: ");
        String oldName = sc.nextLine();

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();

        File oldFile = new File(oldName);
        File newFile = new File(newName);

        if (!oldFile.exists()) {
            System.out.println("File or directory not found.");
            return;
        }

        boolean renamed = oldFile.renameTo(newFile);

        if (renamed) {
            System.out.println("Renamed successfully.");
        } else {
            System.out.println("Rename failed.");
        }
    }
}
