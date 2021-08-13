package LeetCode.easy;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(16)); // true
        System.out.println(new ValidPerfectSquare().isPerfectSquare(14)); // false
    }

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long left = 2;
        long right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long current = mid * mid;
            if (current == num) {
                return true;
            }
            if (current > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
