import java.util.*;
public class RodCuttingRecursion
{
    static int maxPrice(int[] price,int n) {
        // base case
        if(n<=0)
            return 0;
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            maxi = Math.max(maxi,price[i] + maxPrice(price,n-i-1));
        }
        
        return maxi;
    }
    
	public static void main(String[] args) {
		int price[] = {2,5,7,8}; //{ 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = 4;
        System.out.println(maxPrice(price,n));
	}
}
