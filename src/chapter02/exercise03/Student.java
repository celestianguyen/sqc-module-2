package chapter02.exercise03;

/*
Build a Student class that follows the principles of encapsulation.
Student information includes:
     + id: Cannot be modified after creation.
     + name: Must be provided (cannot be empty).
     + score: Must be between 0 and 10.
If any condition is not satisfied, display an error message and do not allow the data to be updated.
Hint:
Do not create a setter for id.
Validate name and score inside their setters.
 */

public class Student {
    private int id;
    private String name;
    private double score;

    //default constructor
    public Student(int id, String name, double score) {
        this.id = id;
        setName(name);
        setScore(score);
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

    public void print(){
        System.out.println("\n======STUDENT INFO======");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Score: " + score);
    }
}
