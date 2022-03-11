package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    double area;
    double perimeter;

    @Override
    void calculateArea(double radius) {
        area = radius * radius * Math.PI;
    }

    @Override
    void calculatePerimeter(double radius) {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    void print() {
        System.out.println("Circle area: " + area + " and perimeter: " + perimeter);
    }
}
