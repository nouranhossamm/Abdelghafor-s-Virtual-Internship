import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Order> orders;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrderHistory() {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Order Date: " + order.getOrderDate());
            System.out.println("Total: $" + order.getTotal());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                product.displayProductDetails();
            }
            System.out.println();
        }
    }
}