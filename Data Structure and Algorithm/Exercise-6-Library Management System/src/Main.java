public class Main {
    public static void main(String[] args) {
        Book[] library = {
                new Book("B001", "The Alchemist", "Paulo Coelho"),
                new Book("B002", "Atomic Habits", "James Clear"),
                new Book("B003", "Clean Code", "Robert Martin"),
                new Book("B004", "Deep Work", "Cal Newport")
        };
        System.out.println("--- Linear Search for 'Clean Code' ---");
        Book found1 = LinearSearch.search(library, "Clean Code");
        System.out.println(found1 != null ? "Found: " + found1 : "Book not found");

        System.out.println("\n--- Binary Search for 'Atomic Habits' ---");
        Book found2 = BinarySearch.search(library, "Atomic Habits");
        System.out.println(found2 != null ? "Found: " + found2 : "Book not found");
    }
}