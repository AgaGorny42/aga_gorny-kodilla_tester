package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public static void main(String[] args) {

    }
    public void process(Shape shape) {
        System.out.println("This is a(n) " + shape.name + ". It's perimeter is " + shape.calcPerimeter() + " and it's surface area is " + shape.calcSurfaceArea() + ".");

    }
}
