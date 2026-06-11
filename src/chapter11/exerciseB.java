package chapter11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * b. Write a program to read exactly 3 lines from a file. Then display the read lines on the console.
 */

public class exerciseB {
    public static void main(String[] args) {
        String filename = "/Users/celestianguyen/Documents/java/sqc-module-2/src/chapter11/sample.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            String line1 = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();

            br.close();

            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
