package chapter09;

import util.InputUtil;

import java.util.*;

public class exercise1c {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int m = InputUtil.inputNonNegativeInt("Enter the number of elements of the first array: ");
        int[] arr1 = new int[m];

        System.out.println("Enter " + m + " integers of the first array: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n = InputUtil.inputNonNegativeInt("Enter the number of elements of the second array: ");
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " integers of the second array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        for (int val : arr1) {
            set1.add(val);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int val : arr2) {
            set2.add(val);
        }

        Set<Integer> sharedElements = new HashSet<>();
        for (int val : set1) {
            sharedElements.add(val);
        }
        for (int val : set2) {
            sharedElements.add(val);
        }

        System.out.println("\nOriginal array 1: " + Arrays.toString(arr1));
        System.out.println("Array 1 after removing duplicate elements: " + set1);
        System.out.println("\nOriginal array 2: " + Arrays.toString(arr2));
        System.out.println("Array 2 after removing duplicate elements: " + set2);
        System.out.println("\nCommon elements between the arrays: " + sharedElements);

    }
}
