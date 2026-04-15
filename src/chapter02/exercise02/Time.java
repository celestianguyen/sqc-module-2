package chapter02.exercise02;

public class Time {
    //attributes
    private int hour;
    private int minute;
    private int second;

    //default constructor
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    //one-param constructor
    public Time(int hour) {
        this.hour = hour;
    }
    public Time(Time dupe){
        this.hour = dupe.hour;
        this.minute = dupe.minute;
        this.second = dupe.second;
    }
    /*
    or depending on the usage of the copy constructor, we can also write it as

    public Time copy() {
        return new Time(this.hour, this.minute, this.second);
    }
     */

    //two-param constructor
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    //three-param constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void print(){
        //0 is for padding, 2 -> minimum 2 digits
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
