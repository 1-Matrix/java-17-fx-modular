package com.example.graphics;

import java.lang.Math.*;

public class Circle extends Shape{


    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double computeArea(double radius) {
        return (getRadius()*getRadius()*Math.PI);
    }

    @Override
    public double comupteCircumference() {
        return (getRadius()*2*Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


