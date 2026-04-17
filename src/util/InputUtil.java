package util;

import java.util.ArrayList;
import java.util.Scanner;


public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int inputPositive(String message) {
        int n;
        do {
            System.out.print(message);
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.print("Invalid input! Please re-enter the value again.");
                System.out.println();
            }

        } while (n <= 0);
        return n;
    }

    public static int getNonZeroInt(String message) {
        int n;
        do {
            System.out.print(message);
            n = scanner.nextInt();

            if (n == 0) {
                System.out.print("Input cannot be zero! Please re-enter the value again.");
                System.out.println();
            }

        } while (n == 0);
        return n;
    }

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String sInt = scanner.nextLine().trim();
            try {
                return Integer.parseInt(sInt);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer only!");
            }
        }
    }


    public static String getString(String prompt){
        String strVal;

        do {
            System.out.print(prompt);
            strVal = scanner.nextLine().trim();
            if (strVal.isEmpty()){
                System.out.println("Invalid input! Please enter a string value.");
            }

        } while (strVal.isEmpty());
        return strVal;
    }

    public static double getScore(String prompt) {
        double value = -1;
        do {
            try {
                System.out.print(prompt);
                value = Double.parseDouble(scanner.nextLine());
                if (value < 0 || value > 10) {
                    System.out.println("Score must be between 0 and 10. Try again :'(");
                    value = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (value < 0 || value > 10);
        return value;
    }

}
