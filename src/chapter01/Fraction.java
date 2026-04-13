package chapter01;

import util.InputUtil;

/*
Write a program to input a fraction (including numerator and denominator).
a. Write input and output methods for a fraction.
    i. The input method must not allow the denominator to be 0.
    ii. The output method should display the fraction in its simplest form
        (for example: 2/8 → 1/4, 8/-4 → -2, …)
b. Calculate the sum, difference, product, and quotient of two fractions.
c. Determine whether the fraction is positive, negative, or equal to zero.
 */
public class Fraction {
    //attributes
    private int numerator;
    private int denominator;

    //input method
    public void input() {
        numerator = InputUtil.readInt("Please enter numerator (int): ");
        denominator = InputUtil.getNonZeroInt("Please enter denominator (> 0): ");
    }

    //output method
    public void output() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        int num = numerator / gcd;
        int den = denominator / gcd;

        if (den < 0) {
            num = -num;
            den = -den;
        }

        if (num == den) {
            System.out.println("1");
        } else if (den == 1) {
            System.out.println(num);
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println(num + "/" + den);
        }
    }

    //sum
    public Fraction add(Fraction frac2) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac2.denominator + frac2.numerator * this.denominator;
        result.denominator = this.denominator * frac2.denominator;
        return result;
    }

    //diff
    public Fraction subtract(Fraction frac2) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac2.denominator - frac2.numerator * this.denominator;
        result.denominator = this.denominator * frac2.denominator;
        return result;
    }

    //product
    public Fraction multiply(Fraction frac2) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac2.numerator;
        result.denominator = this.denominator * frac2.denominator;
        return result;
    }

    //quotient
    public Fraction divide(Fraction frac2) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * frac2.denominator;
        result.denominator = this.denominator * frac2.numerator;
        return result;
    }

    //sign checker
    public String checkSign() {
        if (numerator == 0) {
            return "equal to zero.";
        }
        boolean isPositive = (numerator > 0 && denominator > 0) || (numerator < 0 && denominator < 0);
        if (isPositive) {
            return "Positive.";
        } else {
            return "Negative.";
        }
    }


    private int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println("=====Fraction 1=====");
        Fraction frac = new Fraction();
        frac.input();
        System.out.println("\n=====Fraction 2=====");
        Fraction frac2 = new Fraction();
        frac2.input();
        System.out.print("\nSimplified fraction: ");
        System.out.print("Fraction 1: ");
        frac.output();
        System.out.print("Fraction 2: ");
        frac2.output();
        System.out.println("\nSum of 2 fractions: ");
        frac.add(frac2).output();

        System.out.println("\nDifference of 2 fractions: ");
        frac.subtract(frac2).output();

        System.out.println("\nProduct of 2 fractions: ");
        frac.multiply(frac2).output();

        System.out.println("\nQuotient of 2 fractions: ");
        frac.divide(frac2).output();

        System.out.println("\nSign check of a fraction: ");
        System.out.println(frac.checkSign());


    }
}
