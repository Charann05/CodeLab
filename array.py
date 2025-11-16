#This program sorts the elements of the given array.

n = int(input("Enter the number of elements: "))
a = []

for i in range(n):
    val = int(input(f"Enter element {i+1}: "))
    a.append(val)

for i in range(n-1):
    for j in range(n-1-i):
        if a[j] > a[j+1]:
            temp = a[j]
            a[j] = a[j+1]
            a[j+1] = temp

print("Sorted array:", a)
