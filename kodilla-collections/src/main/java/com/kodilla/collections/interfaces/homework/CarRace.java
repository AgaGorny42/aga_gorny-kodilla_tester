package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford();
        doRace(ford);

        Opel opel = new Opel();
        doRace(opel);

        Fiat fiat = new Fiat();
        doRace(fiat);
    }
    public static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}
