import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Book search(Book[] books, String targetTitle) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = targetTitle.compareToIgnoreCase(books[mid].getTitle());

            if (cmp == 0) return books[mid];
            if (cmp < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }
}