public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O101", "Alice", 120.0),
                new Order("O102", "Bob", 75.5),
                new Order("O103", "Charlie", 199.99),
                new Order("O104", "David", 49.0)
        };
        System.out.println("--- Original Orders ---");
        printOrders(orders);
        Order[] bubbleSorted = orders.clone();
        BubbleSort.sort(bubbleSorted);
        System.out.println("\n--- Orders Sorted by Bubble Sort ---");
        printOrders(bubbleSorted);
        Order[] quickSorted = orders.clone();
        QuickSort.sort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\n--- Orders Sorted by Quick Sort ---");
        printOrders(quickSorted);
    }
    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}