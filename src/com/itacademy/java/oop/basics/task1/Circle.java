package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    double area;
    double perimeter;

    @Override
    public void calculateArea(double radius) {
        area = radius * radius * Math.PI;
    }

    @Override
    public void calculatePerimeter(double radius) {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("Circle area: " + area + " and perimeter: " + perimeter);
    }
}
