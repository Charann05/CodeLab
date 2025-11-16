#This program converts a given temperature between Celsius and Fahrenheit.

print("---Temperature Convertor---")
print("1. C->F")
print("2. F->C")
n = int(input("Enter your choice : "))

if(n==1):
    temp = float(input("Enter the temperature : "))
    temp = temp*(9/5)+32
    print(f"F={temp:.2f}")

elif(n==2):         
    temp = float(input("Enter the temperature : "))
    temp = (temp-32)*5/9
    print(f"C={temp:.2f}")

else:        
    print("Invalid Choice!")
