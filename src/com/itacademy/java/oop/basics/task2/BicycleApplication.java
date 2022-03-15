package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        Speedometer speedometer = new Speedometer();

        mountainBike.speedUp(10);
        roadBike.speedUp(20);

        mountainBike.speedUp(100);
        roadBike.speedUp(100);

        mountainBike.speedUp(90);
        roadBike.speedUp(30);

        mountainBike.applyBrakes(20);
        roadBike.applyBrakes(5);

        mountainBike.applyBrakes(-20);
        roadBike.applyBrakes(-2);

        mountainBike.applyBrakes(80);
        roadBike.applyBrakes(-40);

        mountainBike.applyBrakes(20);
        roadBike.applyBrakes(-20);

        mountainBike.applyBrakes(10);
        roadBike.applyBrakes(-8);

        mountainBike.changeGear(5);
        roadBike.changeGear(5);

        mountainBike.changeGear(-5);
        roadBike.changeGear(-5);

        mountainBike.changeGear(1);
        roadBike.changeGear(2);

        mountainBike.changeGear(-1);
        roadBike.changeGear(-2);

        mountainBike.changeGear(-1);
        roadBike.changeGear(-1);

        mountainBike.changeGear(1);
        roadBike.changeGear(2);
        mountainBike.changeGear(1);
        roadBike.changeGear(2);
        for(int i=0;i<18;i++){
            mountainBike.changeGear(1);
        }
        mountainBike.changeGear(1);

        mountainBike.speedUp(30);
        roadBike.speedUp(10);

        speedometer.chooseWinner(mountainBike,roadBike);

        roadBike.speedUp(10);

        speedometer.chooseWinner(mountainBike,roadBike);

        roadBike.speedUp(10);

        speedometer.chooseWinner(mountainBike,roadBike);
    }
}
