package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCheckActualTime(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstActualTime = context.getBean(Clock.class);
        Clock secondActualTime = context.getBean(Clock.class);
        Clock thirdActualTime = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstActualTime, secondActualTime);
        Assertions.assertNotEquals(secondActualTime, thirdActualTime);
        Assertions.assertNotEquals(firstActualTime, thirdActualTime);
    }
}