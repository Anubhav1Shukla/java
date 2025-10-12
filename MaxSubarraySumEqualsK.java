import java.util.HashMap;


//maximum sub aaray sum in MS
public class MaxSubarraySumEqualsK {
    public static int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (prefixSumMap.containsKey(sum - k)) {
                int prevIndex = prefixSumMap.get(sum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            prefixSumMap.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -2, 5};
        int k = 6;
        System.out.println(maxSubArrayLen(nums, k));
    }
}


