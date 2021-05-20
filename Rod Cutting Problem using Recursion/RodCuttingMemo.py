import sys

def maxPrice(price,n,memo):
    #base case
    if n<=0:
        return 0
    if memo[n] != float('-inf'):
        return memo[n]
    #maxi = float('-inf')    
    for i in range(0,n):
        #maxi = max(maxi, price[i] + maxPrice(price,n-i-1))
        memo[n] = max(memo[n], price[i] + maxPrice(price,n-i-1,memo))
    
    return memo[n]

price = [2,5,7,8]
n = 4
memo = [float('-inf') for i in range(0,n+1)]
print(maxPrice(price,n,memo))
