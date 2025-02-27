package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{

    private int speed;

    public Fiat () {
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed += 5;
    }
    @Override
    public void decreaseSpeed() {
        speed -= 2;
    }
}
