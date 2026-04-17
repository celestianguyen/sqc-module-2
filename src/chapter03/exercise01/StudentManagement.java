package chapter03.exercise01;

public class StudentManagement {
    public static void main(String[] args) {
        // Valid student
        Student s = new Student(1, "Nhu", 10);
        Student s1 = new Student(2, "Guinea Pig", 9);
        s.print();

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

        // Print the current number of students whose info are added
        System.out.println("\nTotal number of students with added info: " + Student.getStudentCount());
    }
}
