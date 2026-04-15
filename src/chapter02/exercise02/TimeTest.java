package chapter02.exercise02;

public class TimeTest {
    public static void main(String[] args) {
        Time a = new Time();
        a.print(); //00:00:00
        System.out.println();
        Time b = new Time(7);
        b.print();
        System.out.println();// 07:00:00
        Time c = new Time(7, 30);
        c.print();
        System.out.println();// 07:30:00
        Time d = new Time(7, 30, 50);
        d.print();
        System.out.println();// 07:30:50
        Time f = new Time(d);
        f.print();                          // 07:30:50
    }
}
