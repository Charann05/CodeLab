#This program reverses a given integer number.

n = int(input("Enter an Integer value : "))

ans = 0
while(n>0):
    rem = n%10
    n //= 10
    ans = ans*10+rem
print(f"The reversed Integer value will be : {ans}")