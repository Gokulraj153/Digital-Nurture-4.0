public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Shoes", "Fashion"),
                new Product("P003", "Book", "Stationery"),
                new Product("P004", "Smartphone", "Electronics")
        };
        System.out.println("--- Linear Search ---");
        Product result1 = Linear_Search.search(products, "Book");
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");
        System.out.println("\n--- Binary Search ---");
        Product result2 = Binary_Search.search(products, "Smartphone");
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}