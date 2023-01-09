package programmer.expert.application;

import programmer.expert.data.Customer;
import programmer.expert.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Yamamoto");
        customer.setLevel(Level.VIP);

        System.out.println("Nama Member : "+customer.getName());
        System.out.println("Level Member : "+customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.PREMIUM.name();
        System.out.println(levelName);

        Level level = Level.valueOf("TEST");
        System.out.println(level);

        System.out.println("===Print Level===");
        for (var value : Level.values()){
            System.out.println(value);
        }

    }
}
