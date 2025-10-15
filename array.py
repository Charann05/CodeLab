#This program sorts the elements of the given array.

n = int(input("Enter the number of elements:"))
a = []

for i in range(n):
    val = int(input(f"Enter the element {i+1}: "))
    a.append(val)

for i in range(n-1):
    if(a[i]>a[i+1]):
        temp = a[i]
        a[i] = a[i+1]
        a[i+1] = temp

print("Sorted array:",a)