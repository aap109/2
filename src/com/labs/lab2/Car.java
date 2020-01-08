package com.labs.lab2;

public abstract class Car {

    String carInfo = "Unknown car";

    public String getCarInfo() {
        return carInfo;
    }

    public abstract int getPrice();
}
