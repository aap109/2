package com.labs.lab2;

public class Disks extends CarDecorator {

    Car mCar;

    Disks(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + "с литыми дисками";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 10000;
    }
}
