package com.charkun704;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int currentGear;
    private boolean auto;

    public Car(String vehicleType, int wheels, int doors, boolean auto) {
        super(vehicleType);
        this.wheels = wheels;
        this.doors = doors;
        this.auto = auto;
        this.currentGear=1;
    }

    public void changeGear(int gear){
        this.currentGear=gear;
        System.out.println("Car.changeGear()\nCar's current gear is "+currentGear);
    }

    public void moveCar(int speed, int direction){
        System.out.println("# In moveCar before initializing vehicle.move "
                            +speed+" "+direction);
        move(speed, direction);
        System.out.println("Car.moveCar()\nSpeed: "+speed+" Direction: "+direction);
    }
}
