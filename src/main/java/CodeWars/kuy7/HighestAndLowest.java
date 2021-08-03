package CodeWars.kuy7;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5")); // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5")); // return "9 -5"
    }
    public static String highAndLow(String strWithNumbers) {
        int[] numbers = Arrays.stream(strWithNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max + " " + min;
    }
}
