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
        Ford ford = new Ford(100);

        cars.add(new Ford(100));
        cars.add(new Opel(80));
        cars.add(new Fiat(70));

//        cars.add(ford);

        cars.remove(1);
        cars.remove(ford);
        Fiat fiat = new Fiat(70);
        cars.remove(fiat);

        System.out.println("Array size: " + cars.size());

        for (Car car : cars) {
            System.out.println("Car kind: " + car + ", car speed: " + car.getSpeed());
        }
    }
}
