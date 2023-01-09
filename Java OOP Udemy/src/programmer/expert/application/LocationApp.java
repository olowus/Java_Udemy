package programmer.expert.application;

import programmer.expert.data.*;

public class LocationApp {
    public static void main(String[] args) {

//        Location location = new Location(); // ERROR karena Abtract Class
        City city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
