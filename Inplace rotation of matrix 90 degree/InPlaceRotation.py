def printValues(arr,n):
    for i in range(0,n):
        for j in range(0,n):
            print(arr[i][j],end="\t")
        print("\n")

arr = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
        ]
n = len(arr)
printValues(arr, n)

#main logic
for i in range(0,n//2):
    for j in range(i,n-i-1):
        temp = arr[i][j]

        arr[i][j] = arr[j][n-i-1]
                
        arr[j][n-i-1] = arr[n-i-1][n-j-1]
                
        arr[n-i-1][n-j-1] = arr[n-j-1][i]
                
        arr[n-j-1][i] = temp

print("output:")
printValues(arr, n)