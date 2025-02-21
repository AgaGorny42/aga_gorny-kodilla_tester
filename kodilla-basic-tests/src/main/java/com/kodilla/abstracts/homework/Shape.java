package com.kodilla.abstracts.homework;

public abstract class Shape {
    String name;

    public Shape (String name) {
        this.name = name;
    }

    public abstract double calcSurfaceArea();
    public abstract double calcPerimeter();

}
