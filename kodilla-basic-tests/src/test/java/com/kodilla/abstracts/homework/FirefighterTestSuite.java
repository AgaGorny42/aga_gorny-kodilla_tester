package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirefighterTestSuite {

   Job firefighter = new Firefighter();

    @Test
    void getSalaryTest() {
        int actual = firefighter.getSalary();
        Assertions.assertEquals(8000, actual);
    }

    @Test
    void getResponsibilities() {
        String actual = firefighter.getResponsibilities();
        Assertions.assertEquals("The fireman puts out fires and saves people.", actual);

    }
}
