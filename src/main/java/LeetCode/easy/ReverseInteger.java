package LeetCode.easy;

public class ReverseInteger {
    // Example 1:
    //
    // Input: x = 123
    // Output: 321
    // Example 2:
    //
    // Input: x = -123
    // Output: -321
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(123));
        System.out.println(new ReverseInteger().reverse(-123));
    }

    public int reverse(int x) {
        int tmpV = Math.abs(x);
        StringBuilder sb = new StringBuilder();
        if (tmpV != x) {
            sb.append('-');
        }
        while (tmpV != 0) {
            sb.append(tmpV % 10);
            tmpV = tmpV / 10;
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
