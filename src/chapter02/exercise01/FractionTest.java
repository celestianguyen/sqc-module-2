package chapter02.exercise01;

public class FractionTest {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.print();                          // 0
        Fraction b = new Fraction(1, 2);
        b.print();                          // 1/2
        Fraction c = new Fraction(3);
        c.print();                          // 3
        Fraction d = new Fraction(-6, -2);
        d.print();                          // 3
        Fraction e = new Fraction(3, -1);
        e.print();                          // -3
        Fraction f = e.copy();
        f.add(100);
        e.print();                          // -3
        f.print();                          // 97
    }
}
