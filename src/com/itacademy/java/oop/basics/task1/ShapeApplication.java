package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circle();

        square.calculateArea(10);
        square.calculatePerimeter(10);

        circle.calculateArea(10);
        circle.calculatePerimeter(10);

        square.print();
        circle.print();
    }
}
