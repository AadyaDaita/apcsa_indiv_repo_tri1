---
toc: true
layout: post
categories: [markdown]
title: College Board MC Reflection Quiz 3
---

## 49/52

**Before the AP Exam, I need to revise enhanced for loops, and looping through 2D arrays. I understand logic gates/de morgans laws, but I need more practice with it**

**Question 7**
- A - Incorrect. This would be the result for the method call combine("00000", "11111"), for example.

- B - Correct. The combine method compares corresponding substrings of length 1
 from input strings one and two. If the substrings are the same, the substring is appended to res; otherwise, "0" is appended to res. The first and second characters of res are "0" because the characters in position 0
 and the characters in position 1
 of one and two differ. The third character of res is "1" because the characters in position 2
 of one and two are both "1". The fourth character in res is "0" because the characters in position 3
 of one and two differ. The fifth character in res is "0" because the last characters of one and two are both "0". The value "00100" is returned.

- c - Incorrect. This would be the result for the method call combine("10111", "01101"), for example.

- D - Incorrect. This would be the result for the method call combine("10111", "11110"), for example.

- E - Incorrect. This would be the result for the method call combine("11111", "11011"), for example.



**Question 44**
- A - Incorrect. This would represent the contents of resultOne if the method assigned values to elements of resultOne in ascending, alphabetical order.

- B - Incorrect. This would represent the contents of resultOne if the method assigned values to elements of resultOne in increasing order of string length.

- C - Incorrect. This would represent the contents of resultOne if the inner for loop initialization were k = j + 2 instead of k = j + 1.

- D - Correct. The method assigns the shortest string that occurs in any element of arr between arr[n] and arr[arr.length - 1], inclusive, to result[n]. The shortest string found between arr[0] and arr[3] is "of", so result[0] is assigned the value "of". The shortest string found between arr[1] and arr[3] is also "of", so result[1] is also assigned the value "of". The same is true for the part of the array that begins at index 2 and ends at index 3, so result[2] is also assigned the value "of". In the last iteration of the outer for loop, there are no values to consider after arr[3], so result[3] is assigned the value "spring".

- E - Incorrect. This would represent the contents of resultOne if the method assigned values to elements of resultOne in decreasing order of string length.


**Question 45**
- A - Correct. Line 12 is executed each time the variable sm is updated because a new smallest value is found. When j has the value 0, sm is updated for "day" and "of". When j has the value 1, sm is updated for "of". When j has the value 4, sm is updated for "year". When j has any of the values 2, 3, or 5, sm is not updated. Line 12 is executed four times.

- B - Incorrect. This would be the result if sm was updated once each time a string shorter than arr[j] was found instead of once each time a new smallest value was identified.

- C - Incorrect. This would be the result if line 12 were executed once for each element of arr.

- D - Incorrect. This would be the result if the method had no if statement and sm was updated once for each pair arr[j] and arr[k] encountered in the nested for loops.

- E - Incorrect. This would be the result if the method had no if statement and the initialization in the inner for loop was k = 1 instead of k = j + 1.

