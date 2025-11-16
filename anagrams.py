#This program tells if the given strings are anagrams or not.

a = input()
b = input()
a = a.lower()
b = b.lower()
if sorted(a) == sorted(b):
    print("Anagrams")
else:
    print("Not Anagram")