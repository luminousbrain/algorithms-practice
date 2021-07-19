package LeetCode.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int size = 1;
        int currentNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentNum) {
                currentNum = nums[i];
                nums[size++] = currentNum;
            }
        }
        return size;
    }
}
