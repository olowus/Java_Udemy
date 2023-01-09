package programmer.expert.application;

import programmer.expert.data.Product;

public class ApplicationProduct {
    public static void main(String[] args) {
        Product product = new Product("MacBook Pro M3", 50_000_000);
//        System.out.println(product.name); // ERROR karena Access Modifier Protected
//        System.out.println(product.price); // ERROR karena Access Modifier Protected
    }
}
