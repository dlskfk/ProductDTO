package ProductDTO;

import java.util.List;

public class ProductView {

    public void displayProduct(Product product) {

        System.out.println(product);
    }

    public void displayProductList(List<Product> products) {

        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayMessage(String message) {

        System.out.println(message);
    }
}