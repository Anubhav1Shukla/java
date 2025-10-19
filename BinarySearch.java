import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int result = Arrays.binarySearch(arr, key);
        if (result >= 0)
            System.out.println("Found at index: " + result);
        else
            System.out.println("Not found");
    }
}


//Binary search is a method to find the position of a target value within a sorted array. It works by repeatedly dividing the search interval in half. If the value of the search key is less
// than the item in the middle of the interval, the search continues in the lower half. Otherwise, it continues in the upper half. This process repeats until the value is found or the interval is empty.
//In Java, the Arrays class provides a built-in method called binarySearch() that implements this algorithm. The method takes a sorted array and a key to search for, returning the index of the key if found, or a negative value if not found.
//Example usage of Arrays.binarySearch():
