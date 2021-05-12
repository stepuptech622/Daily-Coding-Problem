import sys
coins =  [5,7,8,9]
amount = 49
total_coins = len(coins) #4
dp = [[sys.maxsize for j in range(0,amount+1)] for i in range(0,total_coins+1)] #2d [5][8] infy

for i in range(0,len(coins)+1):
    dp[i][0] = 0

for i in range(1,amount+1):
    dp[0][i] = sys.maxsize #infy

for i in range(1,total_coins+1):
    for cur_amount in range(1,amount+1):
        if coins[i-1] <= cur_amount:
            dp[i][cur_amount] = min(1 + dp[i][cur_amount - coins[i-1]], dp[i-1][cur_amount])
        else:
            dp[i][cur_amount] = dp[i-1][cur_amount]

print("The Minimum number of coins required is ",dp[total_coins][amount])