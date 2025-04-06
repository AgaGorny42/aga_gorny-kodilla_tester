package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings = {"Daniel_Z.8-9", "daniel_z.8-9", "dan.-8", "Kot", "Aga.-97_"})
    public void validateUserNameTest(String username) {
        assertTrue(userValidator.validateUsername(username));

    }

    @ParameterizedTest
    @ValueSource(strings = {"Daniel_Z*8-9", "daniel&z.8-9", "da", "K9", "Aga.;97_"})
    public void failUserNameTest(String username) {
        assertFalse(userValidator.validateUsername(username));

    }

    @ParameterizedTest
    @ValueSource(strings = {"Aga\\.gorny78@o2\\.pl", "Aga@o2\\.pl", "Aga\\.7gornyu@gmail9\\.pl", "A-ga\\.7gornyu@gmail9\\.pl"})
    public void validateEmailTest(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Aga_.gorny78@o2.pl", "Aga@o2.pl", "Aga.7gornyu@gmail9.pl", "A-ga.7gornyu@gmail9.pl"})
    public void failEmailTest(String email) {
        assertTrue(userValidator.validateEmail(email));
    }
}