package com.kodilla.inheritance;

public class Windows extends OperatingSystem {

    public Windows (int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Turns on the screen.");

    }
    @Override
    public void turnOf(){
        System.out.println("Turns of the screen.");

    }
}
