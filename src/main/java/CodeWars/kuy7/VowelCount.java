package CodeWars.kuy7;

import java.util.Locale;

public class VowelCount {

    public static void main(String[] args) {
        // We will consider a, e, i, o, u as vowels for this Kata (but not y).
        System.out.println(getCount("abc")); // 1
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();
        final int size = str.length();
        for (int i = 0; i < size; i++) {
            char toCheck = str.charAt(i);
            if (toCheck == 'a' || toCheck == 'e' || toCheck == 'i' || toCheck == 'o' || toCheck == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
