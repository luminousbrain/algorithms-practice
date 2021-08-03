package CodeWars.kuy7;

public class Mumbling {
    public static void main(String[] args) {
        // accum("abcd") -> "A-Bb-Ccc-Dddd"
        // accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        // accum("cwAt") -> "C-Ww-Aaa-Tttt"
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }

    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        final int length = s.length();
        for (int i = 0; i < length; i++) {
            final char toAppend = s.charAt(i);
            sb.append(Character.toUpperCase(toAppend));
            for (int j = 0; j < i; j++) {
                sb.append(toAppend);
            }
            if (i == length - 1) {
                break;
            }
            sb.append('-');
        }
        return sb.toString();
    }
}
