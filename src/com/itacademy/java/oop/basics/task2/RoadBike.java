package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private final int maxSpeed = 50;
    private final int minSpeed = 0;
    private final int minGear = 0;
    private int gear = 0;
    private int speed = 0;

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != 2 && newGear != -1 && newGear != -2) {
            if (newGear < -2) {
                System.out.println("Value is not allowed. Closest value is -2");
            } else {
                System.out.println("Value is not allowed. Closest value is 2");
            }
        } else if (this.gear + newGear < minGear) {
            System.out.println("Road bike gear can not be negative");
        } else {
            this.gear += newGear;
            System.out.println("New road bike gear is " + this.gear);
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("That is negative number. Try to use positive numbers.");
        } else if (this.speed + increment > maxSpeed) {
            System.out.println("Road bike speed it too high! Highest possible value is " + (maxSpeed - this.speed));
        } else {
            this.speed += increment;
            System.out.println("New road bike speed is " + this.speed);
        }
    }

    @Override
    public void applyBrakes(int brakeValue) {
        if (brakeValue >= 0) {
            System.out.println("That is positive number. Try to use negative numbers.");
        } else if (speed + brakeValue < minSpeed) {
            System.out.println("Value is too high! Highest possible value is " + this.speed * -1);
        } else {
            speed += brakeValue;
            System.out.println("Current road bike speed: " + speed);
        }
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
