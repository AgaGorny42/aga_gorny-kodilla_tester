package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquilateralTriangleTestSuite {

    Shape equilateralTriangle = new EquilateralTriangle(2);

    @Test
    void calcSurfaceAreaTest() {

        double actual = Math.round(equilateralTriangle.calcSurfaceArea());
        Assertions.assertEquals(3, actual, 0.00);
    }

    @Test
    void calcPerimeterTest() {

        double actual = equilateralTriangle.calcPerimeter();
        Assertions.assertEquals(6, actual);
    }
}
