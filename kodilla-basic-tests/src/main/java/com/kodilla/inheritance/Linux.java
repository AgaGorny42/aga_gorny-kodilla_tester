package com.kodilla.inheritance;

public class Linux extends OperatingSystem {


    public Linux(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Turns on the program.");

    }

    @Override
    public void turnOf() {
        System.out.println("Turns of the program.");

    }
}
