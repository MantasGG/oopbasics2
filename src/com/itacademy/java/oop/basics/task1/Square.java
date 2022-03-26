package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    double area;
    double perimeter;

    @Override
    public void calculateArea(double side) {
        area = side * side;
    }

    @Override
    public void calculatePerimeter(double side) {
        perimeter = side * 4;
    }

    @Override
    public void print() {
        System.out.println("Square area: " + area + " and perimeter: " + perimeter);
    }
}
