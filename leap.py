#This program tells if the given year is Leap year or not.

y = int(input("Enter a year : "))

if(y%4==0):
    print(f"{y} is a Leap Year")
elif(y%100==0):
    print(f"{y} is not a Leap Year")
elif(y%400==0):
    print(f"{y} is a Leap Year")
else:
    print(f"{y} is not a Leap Year")
