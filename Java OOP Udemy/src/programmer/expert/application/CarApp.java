package programmer.expert.application;

import programmer.expert.data.*;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
    }
}
