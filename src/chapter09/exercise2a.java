package chapter09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * a. Count Word Frequency in a Text
 *    Write a program that receives a text string and uses a Map
 *    to count how many times each word appears in the text.
 */
public class exercise2a {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text string: ");
        String text = scanner.nextLine();

        // split the text into words by space
        String[] words = text.toLowerCase().split(" ");

        // use a map to count how many times each word appears
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (wordCount.containsKey(word)) {
                // already in map so add 1 to its count
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                // first timer
                wordCount.put(word, 1);
            }
        }

        // print the result
        System.out.println("\nThe number of times each word appears:");
        for (String key : wordCount.keySet()) {
            String frequency = (wordCount.get(key) == 1) ? "\"" + key + "\"" + " appears " + wordCount.get(key) + " time" : "\"" + key + "\"" + " appears " + wordCount.get(key) + " times";
            System.out.println(frequency);
        }

    }
}
