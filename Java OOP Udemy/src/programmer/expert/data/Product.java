package programmer.expert.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected Integer price;

    public Product(String name, Integer price){
        this.name = name;
        this.price = price;
    }
//    override method toString untuk melihat bentuk data yang lebih proper
    public String toString(){
        return "Product name: "+name+" , price: "+price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
