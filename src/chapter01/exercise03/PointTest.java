package chapter01.exercise03;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        System.out.println("=====First point=====");
        a.input();
        System.out.println("=====Second point=====");
        b.input();
        System.out.print("\nYou entered: ");
        a.output();
        b.output();
        System.out.println();
        System.out.print("\nDistance between 2 points (rounded to 2 decimal places): ");
        System.out.printf("%.2f", a.distanceTo(b));

    }
}
