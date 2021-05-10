public class InPlaceRotation {
    
    static void printMatrix(int[][] arr,int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                    };
        
        int n = arr.length; // 4
        printMatrix(arr,n);
        // Main Logic
        for(int i=0;i<n/2;i++) { // cycles
            for(int j=i;j<n-i-1;j++) { // i to n-i-1
                int temp = arr[i][j];
                
                arr[i][j] = arr[j][n-i-1];
                
                arr[j][n-i-1] = arr[n-i-1][n-j-1];
                
                arr[n-i-1][n-j-1] = arr[n-j-1][i];
                
                arr[n-j-1][i] = temp;
                
            }
        }
        System.out.println("\n\n output");
        printMatrix(arr,n);
    }
}