package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliticianTestSuite {

    Job politician = new Politician();

    @Test
    void getSalaryTest() {
        int actual = politician.getSalary();
        Assertions.assertEquals(15000, actual);
    }

    @Test
    void getResponsibilities() {
        String actual = politician.getResponsibilities();
        Assertions.assertEquals("Politicians manage the country and ensure its security.", actual);

    }
}
