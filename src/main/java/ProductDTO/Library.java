package ProductDTO;


import java.util.HashMap;
import java.util.List;

public class Library {

    private HashMap<Integer, Product> pMap = new HashMap<>();



    public Library() {

    }

    public void addProduct(Product product) {
        pMap.put(product.getCode(),product);
    }

    public Product getProduct(int code) {
        for (Product p : pMap.values() ) {
            if (p.getCode() == code) {
                return (p) ;
            }
        }
        return null;
    }

    public void updateProduct(int code, String name, String brand) {
        Product product = getProduct(code);
        if (product != null) {
            product.setName(name);
            product.setBrand(brand);
        }
    }

    public void deleteProduct(int code) {
        pMap.remove(code);
    }

    public List<Product> getAllProducts() {
        System.out.println(pMap);
        return List.of();
    }
}

