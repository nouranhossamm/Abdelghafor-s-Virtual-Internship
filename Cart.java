import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product> Products = new ArrayList<>();
    private List<Integer> quantities= new ArrayList<>();
    public void addItem(Product product , int quantity){
        if(product.getStockQuantity()>= quantity)
        {
            Products.add(product);
            quantities.add(quantity);
            product.setStockQuantity(product.getStockQuantity()-quantity);
        }
        else{
            System.out.println("not enough stock for " + product.getName());
        }
    }

    public void removeItem(Product product){
        int index=Products.indexOf(product);
        if(index>=0){
            int quantaty= quantities.get(index);
            product.setStockQuantity(product.getStockQuantity()+quantaty);
            Products.remove(product);
        }

    }
    public void updateProduct(Product product , int newQuantity){
        int index=Products.indexOf(product);

    }
}
