def factorial(n):
    if n==0:
        return 1
    return n * factorial(n-1)

n = int(input("Enter the n value: "))
result = factorial(n)
print("The factorial of {} is {}".format(n,result))