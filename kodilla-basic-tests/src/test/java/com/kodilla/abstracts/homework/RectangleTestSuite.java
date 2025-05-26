package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTestSuite {

    Shape rectangle = new Rectangle(4, 2);

    @Test
    void calcSurfaceAreaTest() {

        double actual = rectangle.calcSurfaceArea();
        Assertions.assertEquals(8, actual);
    }

    @Test
    void calcPerimeterTest() {

        double actual = rectangle.calcPerimeter();
        Assertions.assertEquals(12, actual);
    }
}

