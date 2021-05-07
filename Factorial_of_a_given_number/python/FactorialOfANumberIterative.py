n = int(input("Enter the n value: "))
result = 1
for i in range(2,n+1):
    result *= i
print("The factorial of {} is {}".format(n,result))