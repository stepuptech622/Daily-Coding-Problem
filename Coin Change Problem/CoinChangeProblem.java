import java.util.*;
public class CoinChangeProblem {
    public static void main(String[] args) {
        int coins[] = {1,3,4,5};
        int amount = 7;
        int total_coins = coins.length; //4 
        int[][] dp = new int[coins.length+1][amount+1];

        for(int i=0;i<=total_coins;i++) {
            dp[i][0] = 0;
        }

        for(int i=1;i<=amount;i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }

        for(int i=1;i<=total_coins;i++) {
            for(int cur_amount=1;cur_amount<=amount;cur_amount++) {
                if(cur_amount >= coins[i-1]) {
                    dp[i][cur_amount] = Math.min(1 + dp[i][cur_amount-coins[i-1]],dp[i-1][cur_amount]);
                }
                else {
                    dp[i][cur_amount] = dp[i-1][cur_amount];
                }
            }
        }

        System.out.println("The Minimum number of coins required is "+dp[total_coins][amount]);
    }
}