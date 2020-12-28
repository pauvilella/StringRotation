# StringRotation
Exercise related with Arrays and Strings.

## Exercise Challenge
Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring.
For example: "waterbottle" is a rotation of "erbottlewat".

### Solution
The key to solve this is that you have to realize that when you concatenate one of the two strings with itself, inevitably will contain the other as substring (if one is the rotation of the other). 
So, from here, the algorithm is straightforward. The runtime depends on the runtime of the method isSubstring. If we supose that runs in O(A + B) where A and B are the lengths of the two strings passed in, then our method isRotation runs in O(N) where N is the length of the strings (because they are the same).