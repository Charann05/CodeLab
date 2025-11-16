#This program performs binary search on the given array using "bisect" module

import bisect

a = [10,20,30,40,50,80]
key = int(input("Enter the element to search: "))

index = bisect.bisect_left(a,key)
#print(index)

if index<len(a) and a[index]==key:
    print("Element found at position ", index)
else:
    print("Element not found!")