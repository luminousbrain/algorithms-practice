package CodeWars.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class VerySimple {
    public static void main(String[] args) {
//        System.out.println(remove("123"));
//        System.out.println(summation(8)); // 36
//
//        System.out.println(century(100)); // 1
//        System.out.println(century(101)); // 2
//        System.out.println(century(2000)); // 20
//        System.out.println(century(2001)); // 21

        System.out.println(squareSum(new int[]{1, 2, 2}));
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }

    public static int opposite(int number) {
        return -number;
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        }
        return x;
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

    public static String reversedStrings(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static int summation(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().orElse(-1);
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(x -> x)
                .count();
    }

    public static int century(int number) {
        int century = number / 100;
        if (number % 100 > 0) {
            century++;
        }
        return century;
    }

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(x -> x * x).sum();
    }
}
