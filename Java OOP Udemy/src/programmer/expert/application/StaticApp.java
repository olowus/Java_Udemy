package programmer.expert.application;

import static programmer.expert.data.Constant.*;
import programmer.expert.data.Country;
import static programmer.expert.data.Processors.PROCESSORS;
import programmer.expert.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(2,2,2,2,2)
        );

        Country.City city = new Country.City();
        city.setName("Jakarta");
        System.out.println(city.getName());

        System.out.println("Available Processors : "+ PROCESSORS);
    }
}
