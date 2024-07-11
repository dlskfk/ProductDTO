package ProductDTO;

import java.util.HashMap;

public class Product {
    private static HashMap<Integer, Product> pMap = new HashMap<>();
    private int code;
    private String name;
    private String brand;
    private boolean isUsed;


    public Product() {
    }

    public Product(int code, String name, String brand, boolean isUsed) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.isUsed = isUsed;
    }

    public static HashMap<Integer, Product> getpMap() {
        return pMap;
    }

    public static void setpMap(HashMap<Integer, Product> pMap) {
        Product.pMap = pMap;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setisUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", isUsed=" + isUsed +
                '}';
    }
}
