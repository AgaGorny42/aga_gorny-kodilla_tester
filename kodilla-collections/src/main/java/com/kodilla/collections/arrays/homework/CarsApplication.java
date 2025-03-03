package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int drawnCarKind = random.nextInt(3);
        int speed = getRandomSpeed(random);
        if (drawnCarKind == 0)
            return new Ford(speed);
        else if (drawnCarKind == 1)
            return new Opel(speed);
        else {
            return new Fiat(speed);
        }
    }

    private static int getRandomSpeed(Random random) {
        return random.nextInt(10)+1;
    }

}


