package chapter01.exercise03;

import util.InputUtil;

/*
Write a program that inputs the coordinates of two points on the OXY plane and calculates the distance between them.
Description:
We will create a Point class that stores the X and Y coordinates of a point on the plane.
This class will also include a method to input point coordinates and a method to calculate the distance between two points.
 */
public class Point {
    //attributes
    private int x;
    private int y;

    public void input(){
        x = InputUtil.readInt("Please enter coordinate x: ");
        y = InputUtil.readInt("Please enter coordinate y: ");
    }

    public void output(){
        System.out.printf("(%d, %d)", x, y);
    }

    public double distanceTo(Point b){
        return Math.sqrt((Math.pow(b.x,2) - Math.pow(this.x,2)) + (Math.pow(b.y,2) - Math.pow(this.y,2)));

    }
}
