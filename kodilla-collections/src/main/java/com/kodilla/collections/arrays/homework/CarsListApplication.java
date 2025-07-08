package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford();

        cars.add(new Ford());
        cars.add(new Opel());
        cars.add(new Fiat());

//        cars.add(ford);

        cars.remove(1);
        cars.remove(ford);
        Fiat fiat = new Fiat();
        cars.remove(fiat);

        System.out.println("Array size: " + cars.size());

        for (Car car : cars) {
            System.out.println("Car kind: " + car + ", car speed: " + car.getSpeed());
        }
    }
}
