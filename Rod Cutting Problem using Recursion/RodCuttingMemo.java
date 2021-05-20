import java.util.*;
public class RodCuttingRecursion
{
    static int maxPrice(int[] price,int n,int[] memo) {
        // base case
        if(n<=0)
            return 0;
        //int maxi = Integer.MIN_VALUE;
        if(memo[n] != Integer.MIN_VALUE)
            return memo[n];

        for(int i=0;i<n;i++) {
            memo[n] = Math.max(memo[n],price[i] + maxPrice(price,n-i-1,memo));
        }
        
        return memo[n];
    }
    
	public static void main(String[] args) {
		int price[] = {2,5,7,8}; //{ 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = 4;
        int[] memo = new int[n+1];
        for(int i=0;i<=n;i++)
            memo[i] = Integer.MIN_VALUE;
        System.out.println(maxPrice(price,n,memo));
	}
}
