package com.example.graphics;

public class Rectangular extends Shape{




    private double width;
    private double heigth;

    public Rectangular(double x, double y, double width, double heigth) {
        super(x, y);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double computeArea() {
        return (getWidth()*getHeigth());
    }

    @Override
    public double comupteCircumference() {
        return ((getWidth()+getHeigth())*2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}
