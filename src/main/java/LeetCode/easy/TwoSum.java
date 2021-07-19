package LeetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Input: nums = [2,7,11,15], target = 9
    //  Output: [0,1]
    //  Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[] {2,7,11,15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNumberIndex = new HashMap<>() {{
            put(nums[0], 0);
        }};

        for (int i = 1; i < nums.length; i++) {
            int tmpVal = target - nums[i];
            if (mapNumberIndex.containsKey(tmpVal)) {
                return new int[] {mapNumberIndex.get(tmpVal), i};
            }
            mapNumberIndex.put(nums[i], i);
        }
        return new int[]{-1};
    }
}
