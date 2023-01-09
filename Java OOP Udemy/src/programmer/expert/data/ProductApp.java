package programmer.expert.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("MacBook Pro M2", 40_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product.toString());

        Product product2 = new Product("MacBook Pro M2", 40_000_000);
        System.out.println(product.equals(product2));
    }
}
