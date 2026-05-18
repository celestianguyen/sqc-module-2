package chapter09;

import util.InputUtil;

import java.util.*;

public class exercise1d {
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

        int max = Collections.max(uniqueElements);
        int min = Collections.min(uniqueElements);


        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicate elements: " + uniqueElements);
        System.out.println("\nMax = " + max);
        System.out.println("Min = " + min);
    }
}
