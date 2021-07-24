package LeetCode.easy;

public class RichestCustomerWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (maxWealth < wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
