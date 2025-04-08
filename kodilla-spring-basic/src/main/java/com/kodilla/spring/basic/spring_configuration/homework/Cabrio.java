package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime actualTime = LocalTime.now();

        LocalTime sixAm = LocalTime.of(06, 00);
        LocalTime eightPm = LocalTime.of(20, 00);
        if (actualTime.isAfter(sixAm) && actualTime.isBefore(eightPm)) {
            System.out.println("Headlights turned off.");
            return false;

        }else {
            System.out.println("Headlights turned on.");
            return true;
        }
    }

    @Override
    public String getCarType() {
        return  "Cabrio";
    }
}
