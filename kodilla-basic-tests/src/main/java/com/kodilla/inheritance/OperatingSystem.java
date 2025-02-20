package com.kodilla.inheritance;

public class OperatingSystem {
    int year;

    public OperatingSystem(int year) {
        this.year = year;

    }
    public void turnOn() {
        System.out.println("turn on.");
    }

    public void turnOf() {
        System.out.println("turn of.");

    }
}
