#This program performs binary search on the given array.

a = [10,20,30,40,50,80]
lb = 0
ub = 5
key = int(input("Enter the element to search:"))
found = False
while(lb<=ub):
    m = (lb+ub)//2
    if(a[m]==key):
        print("Element found at position ",m)
        found = True
        break 
    elif(key<a[m]):
        ub = m-1
    else:
        lb = m+1
if not found:
    print("Element not found")
