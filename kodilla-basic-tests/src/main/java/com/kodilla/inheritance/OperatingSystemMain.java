package com.kodilla.inheritance;

public class OperatingSystemMain {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1955);
        operatingSystem.turnOn();
        operatingSystem.turnOf();
        System.out.println(operatingSystem.year);

        Windows windows = new Windows(2021);
        operatingSystem.turnOn();
        System.out.println(windows.year);

        Linux linux = new Linux(1991);
        operatingSystem.turnOn();
        System.out.println(linux.year);


    }
}
