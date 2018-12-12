package com.charkun704;

public class Civic extends Car {
    private int yearModel;

    public Civic(int yearModel) {
        super("Civic", 4, 2, true);
        this.yearModel = yearModel;
    }
}
