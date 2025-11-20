#This program performs basic arithmetic operations on user input.

print("===============================================")
print("             SIMPLE CALCULATOR")
print("===============================================")

a = float(input("Enter the first number : "))
op = input("Enter the operator : ")
b = float(input("Enter the second number : "))

if(op == "+"):
    print(f"Sum : {a+b}")

elif(op == "-"):
    print(f"Difference : {a-b}")

elif(op == "*"):
    print(f"Product : {a*b}")

elif(op == "/"):
    if(b == 0):
        print("Error : Division by zero is not allowed")
    else:
        print(f"Quotient : {a/b}")

elif(op == "%"):
    if(b == 0):
        print("Error : Modulus by zero is not allowed")
    else:
        print(f"Modulus : {a%b}")

else:
    print("Invalid Input!")