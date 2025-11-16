#This program calculates the nth Fibonacci number using an iterative approach.

n = int(input("Enter the nth element :\n"))

if(n==0):
    print("0th element is 0")
    exit()

if(n==1):
    print("1th element is 1")
    exit()

p = 0
c = 1
for i in range(2,n+1):
    c += p
    p = c-p
print(f"{n}th element is {c}")