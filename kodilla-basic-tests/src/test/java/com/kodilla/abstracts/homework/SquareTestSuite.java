package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTestSuite {

    Shape square = new Square(4);

    @Test
    void calcSurfaceAreaTest() {

        double actual = square.calcSurfaceArea();
        Assertions.assertEquals(16, actual);
    }
    @Test
    void calcPerimeterTest(){

        double actual = square.calcPerimeter();
        Assertions.assertEquals(8, actual);
    }
}
