package LeetCode.easy;

public class LongestCommonPrefix {
// Input: strs = ["flower","flow","flight"]
//  Output: "fl"
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] lines) {
        if (lines.length == 0) {
            return "";
        }

        String lcp = lines[0];

        for (int i = 1; i < lines.length; i++) {
            if (lines[i].startsWith(lcp)) {
                continue;
            }
            String toCheck = lines[i];
            int index = 0;
            StringBuilder tmp = new StringBuilder();
            int sizeToCheck = toCheck.length();
            int lcpSize = lcp.length();

            while (index < sizeToCheck && index < lcpSize && lcp.charAt(index) == toCheck.charAt(index)) {
                tmp.append(lcp.charAt(index));
                index++;
            }

            lcp = tmp.toString();
            if (lcp.equals("")) {
                return "";
            }
        }
        return lcp;
    }

    public String longestCommonPrefix2(String[] lines) {
        String lcp = lines[0];
        if (lcp.equals("")) {
            return "";
        }
        for (int i = 1; i < lines.length; i++) {
            String current = lines[i];
            if (current.startsWith(lcp)) {
                continue;
            }

            StringBuilder sb = new StringBuilder();
            int index = 0;
            while (index < lcp.length() && index < current.length() && lcp.charAt(index) == current.charAt(index)) {
                sb.append(lcp.charAt(index));
                index++;
            }
            lcp = sb.toString();

            if (lcp.equals("")) {
                return "";
            }
        }
        return lcp;
    }
}
