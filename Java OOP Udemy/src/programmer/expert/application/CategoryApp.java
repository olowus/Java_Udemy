package programmer.expert.application;

import programmer.expert.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category cat = new Category();

        cat.setId("0069");
        cat.setId(null);
        System.out.println(cat.getId());
    }
}
