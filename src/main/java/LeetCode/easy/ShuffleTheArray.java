package LeetCode.easy;

import java.util.Arrays;

// 1470. Shuffle the Array
public class ShuffleTheArray {
    public static void main(String[] args) {
        // Input: nums = [2,5,1,        3,4,7], n = 3
        // Output: [2,3,5,4,1,7]
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0, j = n; i < n; i++, j++) {
            ans[index++] = nums[i];
            ans[index++] = nums[j];
        }
        return ans;
    }
}
