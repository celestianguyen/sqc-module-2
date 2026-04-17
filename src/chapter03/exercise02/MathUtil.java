package chapter03.exercise02;

import util.InputUtil;

import java.util.Scanner;

/**
 * Write a MathUtil class that contains static methods to perform the following operations:
 * + Add two numbers
 * + Subtract two numbers
 * + Multiply two numbers
 * + Divide two numbers
 */
public class MathUtil {
    static Scanner scanner = new Scanner(System.in);

    //add method
    public static double add(double a, double b) {
        return a + b;
    }

    //subtract method
    public static double subtract(double a, double b) {
        return a - b;
    }

    //multiply method
    public static double multiply(double a, double b) {
        return a * b;
    }

    //divide method
    public static double divide(double a, double b) {
        return a / b;
    }

}
