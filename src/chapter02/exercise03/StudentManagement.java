package chapter02.exercise03;

public class StudentManagement {
    public static void main(String[] args) {
        // Valid student
        Student s = new Student(1, "Nhu", 10);
        s.print();

        // s.setId(99);

        // Valid name update
        s.setName("Esther");
        s.print();

        // Invalid name ~> mt
        s.setName("");
        s.setName("   ");
        s.print();

        // Valid score update
        s.setScore(9.0);
        s.print();

        // Invalid score — out of range
        s.setScore(-1);
        s.setScore(11);
        s.print();
    }
}
