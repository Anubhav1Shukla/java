import java.util.Scanner;



// 🔍 Binary Search — Concept

// Definition:
// Binary Search is a divide-and-conquer algorithm used to find the position of a target element in a sorted array efficiently.

// Instead of checking every element (like Linear Search), Binary Search repeatedly divides the search interval in half.

// ⚙️ Working Principle

// Start with two pointers:

// low = 0 (beginning of array)

// high = n - 1 (end of array)

// Find the middle index:

// 𝑚
// 𝑖
// 𝑑
// =
// 𝑙
// 𝑜
// 𝑤
// +
// (
// ℎ
// 𝑖
// 𝑔
// ℎ
// −
// 𝑙
// 𝑜
// 𝑤
// )
// /
// 2
// mid=low+(high−low)/2

// Compare the middle element (arr[mid]) with the target (key):

// If arr[mid] == key: ✅ Found! Return index.

// If arr[mid] < key: Search right half → low = mid + 1

// If arr[mid] > key: Search left half → high = mid - 1

// Repeat until low > high.

// 🧠 Important Points

// Works only on sorted arrays.

// Time Complexity:

// Best case: O(1) (element at mid)

// Average/Worst case: O(log₂ n)

// Space Complexity:

// O(1) for iterative version

// O(log n) for recursive version (due to recursion stack)



public class BSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Input the key to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Step 3: Call binary search
        int result = binarySearch(arr, key);

        // Step 4: Display result
        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    // Binary Search Function (Iterative)
    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid; // Element found

            if (arr[mid] < key)
                low = mid + 1; // Search right half
            else
                high = mid - 1; // Search left half
        }

        return -1; // Element not found
    }
}
