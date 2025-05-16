package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        LeapYear year = new LeapYear(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfIsDivisibleBy100ButNotBy400() {

        LeapYear year = new LeapYear(2100);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {

        LeapYear year = new LeapYear(2024);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy4() {

        LeapYear year = new LeapYear(2025);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}
