package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    public void addTest () {
        double sum = calculator.add(5, 8);
        Assertions.assertEquals(13, sum);
    }
    @Test
    public void subtractTest() {
        double subtract = calculator.subtract(25, 6);
        Assertions.assertEquals(19, subtract);
    }
    @Test
    public void multiply(){
        double multiply = calculator.multiply(7, -3);
        Assertions.assertEquals(-21, multiply);
    }
    @Test
    public void divide(){
        double divide = calculator.divide(6, 2);
        Assertions.assertEquals(3, divide);
    }
}
