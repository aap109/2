package com.labs.lab2;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String TXT_BORDER = "____________________________________________________";

    public static void main(String[] args) {

        System.out.println("Pfaif A.A. group 8T6B");

        Car LadaCalina = new LadaCalina();

        Car LadaPriora = new LadaPriora();
        LadaPriora = new Tonirovka(LadaPriora);
        LadaPriora = new Spoiler(LadaPriora);

        Car vaz2107 = new VAZ2107();
        vaz2107 = new Disks(vaz2107);

        Car volga = new Volga();
        volga = new Spoiler(volga);
        volga = new Tonirovka(volga);
        volga = new Disks(volga);

        List<Car> cars = Arrays.asList(LadaCalina, LadaPriora, vaz2107, volga);
        for (Car car : cars) {
            System.out.println(car.getCarInfo() + ". Цена: " + car.getPrice());
            System.out.println(TXT_BORDER);
        }
    }
}