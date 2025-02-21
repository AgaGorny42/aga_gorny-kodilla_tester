package com.kodilla.abstracts.homework;

public class EquilateralTriangle extends Shape{
    int sideLength;

    public EquilateralTriangle(int sideLength) {
        super("EquilateralTriangle");
        this.sideLength = sideLength;
    }

    @Override
    public double calcSurfaceArea() {
         return  ((Math.pow(sideLength,2)) * (Math.sqrt(3))) / 2;
    }

    @Override
    public double calcPerimeter() {
       return (3 * sideLength);
    }
}
