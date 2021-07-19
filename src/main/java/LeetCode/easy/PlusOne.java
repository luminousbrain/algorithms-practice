package LeetCode.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        // Input: digits = [4,3,2,1]
        // Output: [4,3,2,2]
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{1, 0, 9, 9})));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] result = new int[digits.length + 1];
                    System.arraycopy(digits, 0, result, 1, digits.length);
                    result[0] = 1;
                    return result;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
