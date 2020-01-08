package com.labs.lab2;

public class Tonirovka extends CarDecorator {

    Car mCar;

    Tonirovka(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " затонированная ";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 5000;
    }
}
