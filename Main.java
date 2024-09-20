import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Apple Watch", "A smartwatch from Apple", 299.99, 100);
        Product product2 = new Product("Samsung TV", "A 4K TV from Samsung", 999.99, 50);
        Product product3 = new Product("Sony Headphones", "Wireless headphones from Sony", 149.99, 200);

        // Create users
        User user1 = new User("John Doe", "john.doe@example.com");
        User user2 = new User("Jane Doe", "jane.doe@example.com");

        // Create orders
        Order order1 = new Order(1, LocalDate.now());
        order1.addProduct(product1, 2);
        order1.addProduct(product2, 1);

        Order order2 = new Order(2, LocalDate.now());
        order2.addProduct(product3, 1);

        // Add orders to users
        user1.addOrder(order1);
        user2.addOrder(order2);

        // Display order history for each user
        System.out.println("Order History for " + user1.getName());
        user1.displayOrderHistory();

        System.out.println("\nOrder History for " + user2.getName());
        user2.displayOrderHistory();

        // Search for products
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        List<Product> searchResults = Product.searchProduct("Apple", products);
        System.out.println("\nSearch Results for 'Apple':");
        for (Product product : searchResults) {
            product.displayProductDetails();
        }

        // Filter products by price
        List<Product> filteredProducts = Product.filterByPrice(100, 500, products);
        System.out.println("\nProducts between $100 and $500:");
        for (Product product : filteredProducts) {
            product.displayProductDetails();
        }
    }
}