package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    int sideLength;
    int sideWidth;

    public Rectangle(int sideLength, int sideWidth) {
        super("Rectangle");
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    @Override
    public double calcSurfaceArea() {
        double surfaceArea = sideLength*sideWidth;
        return surfaceArea;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = (2*sideWidth + 2*sideWidth);
        return perimeter;
    }
}
