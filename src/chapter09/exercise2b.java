package chapter09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
Check Name Uniqueness
Write a program that receives a list of names and uses a Map to check which names are unique (appear only once) and which names appear multiple times.
 */
public class exercise2b {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of names: ");
        String text = scanner.nextLine();

        // split the list of names into separate names by space
        String[] names = text.toLowerCase().split(" ");

        // use a map to count how many times each name appears
        Map<String, Integer> nameCount = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            if (nameCount.containsKey(name)) {
                // already in map so add 1 to its count
                int count = nameCount.get(name);
                nameCount.put(name, count + 1);
            } else {
                // first timer
                nameCount.put(name, 1);
            }
        }

        // print the result
        System.out.println("\nThe number of times each name appears:\n");
        for (String key : nameCount.keySet()) {
            String frequency = (nameCount.get(key) == 1) ? "\"" + key.substring(0,1).toUpperCase() + key.substring(1) + "\"" + " is unique as it appears " + nameCount.get(key) + " time" : "\"" + key.substring(0,1).toUpperCase() + key.substring(1) + "\"" + " appears multiple times" + " (" + nameCount.get(key) + ")";
            System.out.println(frequency);
        }
    }
}
