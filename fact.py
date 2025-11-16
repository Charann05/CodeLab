#This program generates the factorial of the given number.

n = int(input("Enter a number :\n"))
fact = 1

if(n<0):
    print("Not Defined!")

else:
    for i in range(1,n+1):
        fact *= i
    print(f"The factorial of {n} is {fact}")