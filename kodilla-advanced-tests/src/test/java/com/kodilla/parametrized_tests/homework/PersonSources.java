package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForTestingPersonBmi() {
        return Stream.of(
                Arguments.of(1.80, 48, "Very severely underweight"),
                Arguments.of(1.80, 50,"Severely underweight"),
                Arguments.of(1.80, 54, "Underweight"),
                Arguments.of(1.80, 83, "Normal (healthy weight)"),
                Arguments.of(1.80, 108, "Overweight"),
                Arguments.of(1.80, 127, "Obese Class I (Moderately obese)"),
                Arguments.of(1.80, 136, "Obese Class II (Severely obese)"),
                Arguments.of(1.80, 151, "Obese Class III (Very severely obese)"),
                Arguments.of(1.80, 169, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.80, 199, "Obese Class V (Super Obese)"),
                Arguments.of(1.80, 45, "Obese Class VI (Hyper Obese)")
        );
    }
}
