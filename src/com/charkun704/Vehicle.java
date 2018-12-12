package com.charkun704;

public class Vehicle {
    private String vehicleType;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(int speed, int direction){
        currentSpeed += speed;
        currentDirection += direction;
        System.out.println("Vehicle.move()\nMoving at "+currentDirection+"km/h and direction of "+currentDirection
                            +" degrees");
    }
    public String getVehicleType() { return vehicleType; }

    public int getCurrentSpeed() { return currentSpeed; }

    public int getDirection() { return currentDirection; }

    public void stop(){ this.currentSpeed = 0; }
}
