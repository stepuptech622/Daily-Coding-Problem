import java.util.*;
public class FactorialOfANumberIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        int result = 1;
        for(int i=2;i<=n;i++) {
            result *= i;
        }

        System.out.println("Factorial of "+n+" is "+result);
    }
}


//bottom up 
//n =4
//1
// 1 *2 = 2
// 2 * 3 = 6
// 3 * 4 = 12
