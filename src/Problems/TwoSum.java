package Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static String getTitle() {
        return "1. Two Sum";
    }
    public static String getQuestion() {
        return """
                Given an array of integers nums and an integer target,
                return indices of the two numbers such that they add up to target.
                Example: nums = [2,7,11,15], target = 9
                Output: [0, 1]
                Difficulty: Easy  |  Topic: Math
                """;
    }
    public static void solve() {
        // --- Test Case 1 ---
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.printf("Test 1 | nums=[2,7,11,15]  target=9  →  Output: [%d, %d]%n",
                result1[0], result1[1]);

        // --- Test Case 2 ---
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.printf("Test 2 | nums=[3,2,4]      target=6  →  Output: [%d, %d]%n",
                result2[0], result2[1]);

        // --- Test Case 3 ---
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.printf("Test 3 | nums=[3,3]        target=6  →  Output: [%d, %d]%n",
                result3[0], result3[1]);
    }
    public static String getCode() {
        return """
            public static int[] twoSum(int[] nums, int target) {
                Map<Integer, Integer> pairIdx = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
                    int num = nums[i];
                    if (pairIdx.containsKey(target - num)) {
                        return new int[]{i, pairIdx.get(target - num)};
                    }
                    pairIdx.put(num, i);
                }
                return new int[]{};
            }
            """;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                return new int[]{i, pairIdx.get(target - num)};
            }
            pairIdx.put(num, i);
        }
        return new int[]{};
    }

}
