package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public static void chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            System.out.println("Winner is " + Bike.MOUNTAIN);
        } else if (mountainBike.getSpeed() < roadBike.getSpeed()) {
            System.out.println("Winner is " + Bike.ROAD + " bike");
        } else {
            System.out.println("Tie");
        }
    }

    public static void chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {

    }
}
