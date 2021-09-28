package com.company;

public class MyTime {
    private int hour;
    private int minute;
    private double second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public MyTime(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}