package chapter02.exercise01;

import util.InputUtil;

/*
Create a Fraction class with constructors and a print(), copy() and add() method to meet the following requirements.
 */
public class Fraction {
    //attributes
    private int numerator;
    private int denominator;

    //default constructor
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    //one-param constructor
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    //two-param constructor
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //print method
    public void print() {
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

    //'new' keyword triggers JVM to find a new spot in Heap mem to store new obj
    public Fraction copy(){
        return new Fraction(this.numerator, this.denominator);
    }

    public Fraction add(int value) {
        Fraction result = new Fraction();
        result.numerator = numerator + value * denominator;
        result.denominator = denominator;
        return result;
    }

    //helper
    private int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
