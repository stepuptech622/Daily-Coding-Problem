import java.util.*;
public class FactorialOfANumberRecursive {
    static int factorial(int n) {
        if(n==0)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of "+n+" is "+result);
    }
}

 