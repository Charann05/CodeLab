#This program checks if the given word is a Palindrome.

s = input("Enter a word :\n")
s = s.lower()
r = s[::-1]

if(s==r):
    print("It is a Palindrome")
else:
    print("It is not a Palindrome")