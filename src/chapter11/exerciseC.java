package chapter11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * c. Write a program to count how many times a word appears in a file. Each word is placed on a separate line in the file.
 */
public class exerciseC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        String filename = "/Users/celestianguyen/Documents/java/sqc-module-2/src/chapter11/bangers.txt";
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(word)) {
                    count++;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (count > 1) {
            System.out.println("\"" + word + "\" appears " + count + " times");
        } else {
            System.out.println("\"" + word + "\" appears " + count + " time");
        }
    }
}
