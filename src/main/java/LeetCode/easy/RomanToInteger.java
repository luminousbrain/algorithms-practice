package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // Example 3:
    //
    //Input: s = "IX"
    //Output: 9
    //Example 4:
    //
    //Input: s = "LVIII"
    //Output: 58
    //Explanation: L = 50, V= 5, III = 3.

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInteger("IX"));
        System.out.println(new RomanToInteger().romanToInteger("LVIII"));
    }

    public int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        final int size = s.length() - 1;
        int result = map.get(s.charAt(size));

        for (int i = 0; i < size;) {
            int left = map.get(s.charAt(i));
            int right = map.get(s.charAt(++i));
            if (left < right) {
                result -= left;
            } else {
                result += left;
            }
        }
        return result;
    }
}
