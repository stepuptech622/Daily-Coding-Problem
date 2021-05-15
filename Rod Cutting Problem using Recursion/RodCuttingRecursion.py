import sys

def maxPrice(price,n):
    #base case
    if n<=0:
        return 0

    maxi = float('-inf')    
    for i in range(0,n):
        maxi = max(maxi, price[i] + maxPrice(price,n-i-1))
    
    return maxi

price = [2,5,7,8]
n = 4

print(maxPrice(price,n))
