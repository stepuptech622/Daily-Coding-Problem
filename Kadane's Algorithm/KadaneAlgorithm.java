import java.util.*;
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,3,2,-1};
        int local_maxima = arr[0];
        int global_maxima = arr[0];

        for(int i=1;i<arr.length;i++) {
            local_maxima = Math.max(arr[i], arr[i] + local_maxima);
            global_maxima = Math.max(local_maxima,global_maxima);
        }

        System.out.println("The Largest Subarray Sum is "+global_maxima);
    }
}

// O(N)