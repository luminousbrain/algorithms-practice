package CodeWars.kuy7;

public class SquareEveryDigit {
    public static void main(String[] args) {
        // For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1
        System.out.println(squareDigits(9119)); // 811181
        System.out.println(squareDigits(0));
        System.out.println(squareDigits(10));
        System.out.println(squareDigits(-1));
    }

    public static int squareDigits(int n) { // bad solution
        String str = n + "";
        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) == '-') {
            sb.append('-');
            str = str.substring(1);
        }
        final int length = str.length();
        for (int i = 0; i < length; i++) {
            final int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sb.append(num * num);
        }
        return Integer.parseInt(sb.toString());
    }
}
