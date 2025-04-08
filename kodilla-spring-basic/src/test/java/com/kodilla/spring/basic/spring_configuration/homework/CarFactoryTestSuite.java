package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void headlightsSUVTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car suv = context.getBean(SUV.class);
        boolean lights = suv.hasHeadlightsTurnedOn();

        Assertions.assertFalse(lights);
    }
    @Test
    public void headlightsSedanTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car sedan = context.getBean(Sedan.class);
        boolean lights = sedan.hasHeadlightsTurnedOn();

        Assertions.assertFalse(lights);
    }
    @Test
    public void headlightsCabrioTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car cabrio = context.getBean(Cabrio.class);
        boolean lights = cabrio.hasHeadlightsTurnedOn();

        Assertions.assertFalse(lights);
    }
    @Test
    public void chooseCarTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");
        String carType = car.getCarType();
        System.out.println(carType);
        String expected = "Sedan";

        Assertions.assertEquals(expected, carType);
    }
}
