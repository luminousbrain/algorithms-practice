package LeetCode.easy;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println(new DefangingAnIPAddress().solution1("1.1.1.1"));
        System.out.println(new DefangingAnIPAddress().solution2("1.1.1.1"));
    }

    public String solution1(String address) {
         return address.replaceAll("\\.", "[.]");
    }

    public String solution2(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
