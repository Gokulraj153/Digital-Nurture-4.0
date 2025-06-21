public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Product p1 = new Product("P101", "Laptop", 10, 75000.0);
        Product p2 = new Product("P102", "Mouse", 50, 500.0);
        Product p3 = new Product("P103", "Keyboard", 30, 1000.0);
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        System.out.println("\n--- Inventory ---");
        manager.displayInventory();
        System.out.println("\n--- Update Product P102 ---");
        manager.updateProduct("P102", 45, 450.0);
        System.out.println("\n--- Delete Product P101 ---");
        manager.deleteProduct("P101");
        System.out.println("\n--- Final Inventory ---");
        manager.displayInventory();
    }
}