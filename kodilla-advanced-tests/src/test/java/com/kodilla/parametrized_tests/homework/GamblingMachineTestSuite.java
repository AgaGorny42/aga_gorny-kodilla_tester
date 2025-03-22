package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 0, 50, 51, 52})
    public void InvalidNumbers_withException(int number) {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);
        userNumbers.add(number);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @Test
    public void incorrectNumberOfRandomNumbersTest_withException() {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

   @Test
    public void incorrectNumberOfRandomNumbersTest2_withException() {
        Set<Integer> userNumbers = new HashSet<>();
       userNumbers.add(1);
       userNumbers.add(2);
       userNumbers.add(3);
       userNumbers.add(4);
       userNumbers.add(5);
       userNumbers.add(6);
       userNumbers.add(7);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @ValueSource (ints = {1,2,3,4,5})
    public void howManyWinsTest(int input) {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(11);
        userNumbers.add(21);
        userNumbers.add(31);
        userNumbers.add(41);
        userNumbers.add(43);
        userNumbers.add(input);
        int match = 0;
        try {
            match = gamblingMachine.howManyWins(userNumbers);
            assertTrue(match >= 0 && match <=5);
        } catch (InvalidNumbersException e) {
            throw new RuntimeException(e);
        }
    }
}
