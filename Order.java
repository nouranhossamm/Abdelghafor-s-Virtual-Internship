import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private double total;
    private List<Product> products;

    public Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotal() {
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        total += product.getPrice() * quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total: $" + total);
        System.out.println("Products:");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}