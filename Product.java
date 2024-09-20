import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String description;
    private double price;
    private int stockQuantity;

    public Product(String name, String description, double price, int stockQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    //search by name

    public static List<Product> searchProduct(String keyword , List<Product> Products){
        List<Product>result = new ArrayList<>();
        for(Product product: Products){
            if(product.getName().toLowerCase().contains(keyword.toLowerCase())){
                result.add(product);
            }
        }
        return result;
    }

    //filter by price
    public static List<Product> filterByPrice(double minPrice , double maxPrice , List<Product> Products ){
        List<Product> result= new ArrayList<>();
        for(Product product: Products){
            if(product.getPrice()>= minPrice && product.getPrice()<=maxPrice){
                result.add(product);
            }
        }
        return result;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product: " + name + ", Description: " + description + ", Price: $" + price + ", Stock: " + stockQuantity);
    }

}
