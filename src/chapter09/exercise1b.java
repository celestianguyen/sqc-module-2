package chapter09;

import util.InputUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercise1b {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = InputUtil.inputNonNegativeInt("Enter the number of elements: ");

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers: ");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> uniqueElements = new HashSet<>();
        for (int val : arr) {
            uniqueElements.add(val);
        }

        int sum = 0;
        for (int val : uniqueElements) {
            sum += val;
        }


        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicate elements: " + uniqueElements.toString());
        System.out.println("Sum of unique elements in the array = " + sum);

    }
}
