public class RichestCustomerWealth {

// https://leetcode.com/problems/richest-customer-wealth/submissions/1730313528/
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int richestWealth = maximumWealth(accounts);
        System.out.println("The richest customer's wealth is: " + richestWealth);
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0; 
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0; 
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth; 
            }
        }
        return maxWealth; 
    }
}
