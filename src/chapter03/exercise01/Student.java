package chapter03.exercise01;

/*
Write a Student class that represents a student, including the following information:
     + Id
     + Name
     + Score
Use a static variable to count how many students have been created, and write a static method to access this number.
 */
public class Student {
    private int id;
    private String name;
    private double score;
    private static int studentCount = 0;

    //constructor
    public Student(int id, String name, double score) {
        this.id = id;
        setName(name);
        setScore(score);
        studentCount++;
    }

    //=============ID===================
    public int getId() {
        return id;
    }

    //===========Student name============
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid input. Name cannot be null or empty.");
        } else {
            this.name = name;
        }
    }

    //===========Student score===========
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Invalid input. Score must be within the range of 0-10.");
        } else {
            this.score = score;
        }
    }

    //===========Student count===========
    public static int getStudentCount() {
        return studentCount;
    }

    public void print() {
        System.out.println("\n======STUDENT INFO======");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Score: " + score);
    }


}
