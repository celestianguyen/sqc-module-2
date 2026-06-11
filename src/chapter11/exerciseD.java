package chapter11;

import java.io.File;
import java.util.Scanner;

/**
 * d. Write a program to check whether a path points to a file or a directory.
 */
public class exerciseD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path: ");
        String path = sc.nextLine();

        File f = new File(path);

        if (!f.exists()) {
            System.out.println("Path does not exist.");
        } else if (f.isFile()) {
            System.out.println(path + " is a file.");
        } else if (f.isDirectory()) {
            System.out.println(path + " is a directory.");
        }
    }
}
