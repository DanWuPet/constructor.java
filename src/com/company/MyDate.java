package com.company;

public class MyDate {
    private int year;
    private String month;
    private int day;

    public MyDate(int year, String month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate(){
        this.year = 2000;
        this.month = "December";
        this.day = 24;
    }
    public String toString() {
        return "Year: " + year + " Month: " + month + " Day: " + day;
    }
}

