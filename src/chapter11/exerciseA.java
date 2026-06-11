package chapter11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** Write a program to read all lines from a file.
 * Then display all the read content on a single line.
 */
public class exerciseA {
    public static void main(String[] args) {
        String filename = "/Users/celestianguyen/Documents/java/sqc-module-2/src/chapter11/sample.txt";
        String result = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                if (!result.isEmpty()) {
                    result += " | ";
                }
                result += line;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(result);
    }
}
