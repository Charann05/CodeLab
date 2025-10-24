#This program tells if the given number is Prime or Not Prime.

import math

n = int(input("Enter a number : \n"))

if(n<=1):
    print(f"{n} is not Prime")
else:

    flag = 0
    
    for i in range(2, int(math.sqrt(n))+1):
        if(n%i==0):
            flag = 1
            break
    
    if(flag==0):
        print(f"{n} is Prime")
    else:
        print(f"{n} is not Prime")