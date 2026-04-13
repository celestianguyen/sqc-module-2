package chapter01;

import util.InputUtil;

import java.util.Scanner;

/*
Write a program that allows users to input student information, including the student’s name, math score, and literature score.
Calculate the average score and display the result.
 */
public class Student {
    //student's attributes
    public String name;
    public double mathScore;
    public double literatureScore;

    // input method
    public void input(){
        Scanner scanner = new Scanner(System.in);

        name = InputUtil.getString("Please enter student name: ");
        mathScore = InputUtil.getScore("Please enter student's math score: ");
        literatureScore = InputUtil.getScore("Please enter student's literature score: ");
    }
    // method for calculating average score
    public double calcAverageScore(){
        return (mathScore + literatureScore) / 2;
    }

    // output method
    public void output(){
        System.out.println("\n=====Student Info=====");
        System.out.println("Student name: " + name);
        System.out.println("Student's math score: " + mathScore);
        System.out.printf("Student's literature score: " + literatureScore);
        System.out.println();
        System.out.printf("Student's average score: %.2f%n", calcAverageScore());
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.output();
    }
}
