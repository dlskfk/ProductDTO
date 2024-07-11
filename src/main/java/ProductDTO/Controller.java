package ProductDTO;

import java.util.HashMap;
import java.util.List;

public class Controller {

    private Library library;
    private ProductView view;
    private static HashMap<Integer, Product> pMap = new HashMap<>();
    private List<Product> HashMap;


    public Controller() {
        library = new Library();
        view = new ProductView();
    }

    public void addProduct(int code, String name, String brand, boolean isUsed) {

        Product product = new Product(code, name, brand, isUsed);

        library.addProduct(product);

        view.displayMessage("상품이 추가되었습니다.");
    }

    public void getProduct(int code) {

        Product pro = library.getProduct(code);

        if (pro != null) {
            view.displayProduct(pro);
        } else {
            view.displayMessage("상품을 찾을 수 없습니다.");
        }
    }

    public void updateProduct(int code, String name, String brand) {

        library.updateProduct(code, name, brand);

        view.displayMessage("상품이 수정되었습니다.");
    }

    public void deleteProduct(int code) {

        library.deleteProduct(code);

        view.displayMessage("상품이 삭제되었습니다.");
    }


    public void getAllProducts() {

        view.displayProductList(library.getAllProducts());
    }
}

