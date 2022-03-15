package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private final int maxSpeed = 100;
    private final int minSpeed = 0;
    private final int maxGear = 20;
    private final int minGear = 0;
    private int gear;
    private int speed = 0;

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != -1) {
            System.out.println("The value is not allowed! Use 1 or -1");
        } else if (this.gear + newGear < minGear) {
            System.out.println("Mountain bike has reached lowest gear " + minGear);
        } else if (this.gear + newGear > maxGear) {
            System.out.println("Mountain bike has reached its max gear limit " + maxGear);
        } else {
            this.gear += newGear;
            System.out.println("New mountain bike gear is " + this.gear);
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("That is negative number. Try to use positive numbers.");
        } else if (this.speed + increment > maxSpeed) {
            System.out.println("Mountain bike speed it too high! Highest possible value is " + (maxSpeed - this.speed));
        } else {
            this.speed += increment;
            System.out.println("New mountain bike speed is " + this.speed);
        }
    }

    @Override
    public void applyBrakes(int brakeValue) {
        if (brakeValue < 0) {
            System.out.println("That is negative number. Try to use positive numbers.");
        } else if (this.speed - brakeValue < -10) {
            System.out.println("Value is too high! Highest possible value is " + (this.speed + 10));
        } else {
            this.speed -= brakeValue;
            System.out.println("Current mountain bike speed: " + speed);
        }
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
