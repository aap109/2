package com.labs.lab2;

public class Spoiler extends CarDecorator {

    Car mCar;

    Spoiler(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " со спойлером";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 8000;
    }
}
