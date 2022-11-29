---
toc: true
layout: post
categories: [markdown]
title: College Board MC Reflection
---

## 35/40

**Question 29**
- A - Incorrect. This will print all the consecutive values from 1 to 25. This will output the same number of values but the values will not be the same.

- B - Incorrect. This will print the values 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, and 97. This will output the same number of values but the values will not be the same.

- c - Incorrect. This prints the remainder of each value from 1 to 100 when divided by 4. It will print 1 % 4, which is 1, then 2 % 4, which is 2, then 3 % 4, which is 3, then 4 % 4, which is 0, then it will repeat this pattern printing 1, 2, 3, 0 until k is greater than 100.

- D - Incorrect. This will print 4, 16, 64, since k is assigned the value of k * 4 for each iteration.

- E - Correct. The original code segment prints all values between 1 and 100 that are evenly divisible by 4. The following values are printed: 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96, and 100. Choice E shows these values can also be printed by having a for loop that has a loop control variable k that starts at 4, increments by 4, and terminates when k is greater than 100.
![quiz1](https://user-images.githubusercontent.com/89221238/200909499-e6874978-7430-4d42-a7ad-7bac5938bd92.png)



**Question 24**
- A - Incorrect. This would be the correct answer if the algorithm filled newArray in row major order instead of column major order. Since the algorithm fills newArray in column major, the value 3 is at newArray[2][0]. The first index represents the row and the second represents the column.

- B - Incorrect. The row and column indices for 2D arrays start at 0. The value 4 is at newArray[0][1].

- C - Incorrect. The value 5 is at newArray[1][1].

- D - Correct. The enhanced for loop iterates over the array oldArray. In the first iteration, newArray[0][0] is assigned the value 1. The value of row is incremented to 1. Since 1 % 3 does not equal 0, the statements in the if are not executed. In the next iteration, newArray[1][0] is assigned the value 2. The value of row is incremented to 2. The algorithm continues to fill column 0 with the subsequent values of oldArray. Once row is 3, the if condition is true and row is assigned 0 and col is incremented to 1. The algorithm proceeds to fill column 1. When the for loop terminates, newArray contains the following values { {1, 4, 7}, {2, 5, 8}, {3, 6, 9} }. The value of newArray[0][2] is 7.

- E - Incorrect. The row and column indices for 2D arrays start at 0. The value 8 is at newArray[1][2].
![quiz2](https://user-images.githubusercontent.com/89221238/200909541-3790f7ba-89be-49ac-9763-59c8c8ec6cd8.png)



**Question 19**
- A - Incorrect. The opposite of greater than is less than or equal. Therefore, the opposite of (b > 7) is (b <= 7).

- B - Correct. De Morgan’s Law states that !(p && q) is equivalent to !p || !q. By applying De Morgan’s Law to this expression, we negate the first expression !(!(a !=b)) and the second expression !(b >7) to form !(!(a != b)) || !(b > 7). In the first expression the two consecutive not operators (!) cancel each other out giving us (a != b). In the second expression, the opposite of > is <= giving us (b <= 7). The equivalent expression is (a != b) || (b <= 7).

- C - Incorrect. The opposite of !(a != b) is just (a != b).

- D - Incorrect. When you apply De Morgan’s Law the logic operator and (&&) becomes an or (||) and vice versa.

- E - Incorrect. The opposite of !(a != b) is just (a != b). When you apply De Morgan’s Law the logic operator and (&&) becomes an or (||) and vice versa. The opposite of (b > 7) is (b <= 7).

![quiz3](https://user-images.githubusercontent.com/89221238/200909593-05b56a62-16ae-402a-aed4-1cb062e9490a.png)


**Question 14**
- A - Incorrect. The scope of variable j is in the first for loop since j is declared in the loop header. Once the first for loop has terminated, the variable j no longer exists.

- B - Incorrect. Using the value of k will mean that some or all of the elements from a1 will not be in result as they will be replaced with a2 values. In the first for loop, result[0] was assigned a1[0]. In the second loop, when k has the value 0, result[0] will be assigned a2[0].

- C - Incorrect. The value of result[a1.length – 1] was assigned a1[a1.length – 1] in the first loop. In the first iteration of the second loop when k is 0, result[a1.length – 1] will be assigned a2[0], meaning the value of a1[a1.length – 1] will not be in result.

- D - Correct. In the first for loop, all the values from a1 are copied over to result at corresponding indices. At this point, the elements at index 0 through a1.length – 1 are full. The first index where the first element of a2 should be copied into is a1.length. We can use the loop control variable k to access all the elements in a2 and k + a1.length to access the corresponding elements in result.

- E - Incorrect. This will cause the value of result[a1.length] to remain 0,the default initial value for elements in an array of type int. Additionally, when k has the value a2.length – 1, the program will attempt to access the element result[a2.length – 1  + a1.length + 1] or result[a2.length + a1.length] and an ArrayIndexOutOfBoundsException will be thrown.
![quiz4](https://user-images.githubusercontent.com/89221238/200909667-0268be78-45e1-4194-83cf-8d8f1ea63912.png)


**Question 4**
- A - Incorrect. This would be the result if the boolean condition evaluated to true, such as if it was(x < 10) || (y < 0).

- B - Incorrect. This would be the result if the division used was floating point division, instead of integer division. This would be the case if either x or y were of type double instead of type int or if either value was typecast as a double in the expression.

- C - Correct. When we evaluate the express(x < 10) && (y < 0) for x having the value 7 and y having the value 3, x < 10 evaluates to true, since 7 is less than 10, and y < 0 evaluates to false, since 3 is not less than 0. The logic operator && evaluates to true when both conditions are true and evaluates to false otherwise. Since the second condition is false, the boolean expression is false. As a result, the compiler will skip the first output statement and execute the statement in the else. The expression x / y is integer division for 7 / 3, which is 2.

- D - Incorrect. This would be the result if the expression x / y was y / x instead.

- E - Incorrect. This would be the result if the expression x / y was x % y instead.
![quiz5](https://user-images.githubusercontent.com/89221238/200909695-4a513396-c8ab-4fbe-954b-fad784fdbe86.png)
