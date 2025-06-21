import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory;
    public InventoryManager() {
        inventory = new HashMap<>();
    }
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product.getProductId());
    }
    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + productId);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }
    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product removed: " + productId);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}