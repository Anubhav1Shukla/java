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
