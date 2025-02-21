package com.kodilla.abstracts.homework;

public class Square extends Shape{
    int sideLength = 0;

    public Square(int sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    public double calcSurfaceArea() {
        double surfaceArea = (Math.pow(sideLength , 2));
        return surfaceArea;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = (2*sideLength);
        return perimeter;
    }
}
