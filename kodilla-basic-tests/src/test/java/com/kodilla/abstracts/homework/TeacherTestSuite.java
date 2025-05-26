package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeacherTestSuite {

    Job teacher  = new Teacher();

    @Test
    void getSalaryTest() {
        int actual = teacher.getSalary();
        Assertions.assertEquals(7000, actual);
    }

    @Test
    void getResponsibilities() {
        String actual = teacher.getResponsibilities();
        Assertions.assertEquals("Teachers teach and educate children at schools.", actual);

    }
}
