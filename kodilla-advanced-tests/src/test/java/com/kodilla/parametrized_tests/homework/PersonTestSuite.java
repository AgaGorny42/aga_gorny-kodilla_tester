package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonTestSuite {

    Person person = new Person(182, 62);

        @ParameterizedTest
        @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideDataForTestingPersonBmi")
        public void shouldCheckStringGetBmiTest( double heightMeters, double weightInKilogram, String expected) {
            String result = person.getBMI();
        }
    }
