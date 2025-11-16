#This program tells if the given number is Positive, Negative or Zero.

n = int(input("Enter a number :\n"))

if(n==0):
    print("The number is a Zero")
elif(n>0):
    print(f"The number {n} is Positive")
else:
    print(f"The number {n} is Negative")