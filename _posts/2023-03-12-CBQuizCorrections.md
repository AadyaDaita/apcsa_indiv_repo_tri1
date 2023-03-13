---
toc: true
layout: post
categories: [markdown]
title: College Board MC Reflection Quiz 4
---

## 33/39

**Before the AP Exam, I need to revise enhanced for loops, and looping through 2D arrays. I understand logic gates/de morgans laws, but I need more practice with it**

**Question 3**
- A - Incorrect. The code results in a runtime error.

- B - Correct. The object that was created is of type B, so the show method in class B is called which prints B.

- c - Incorrect. This would be the result if the show method in B first called super.show() before printing B.

- D - Incorrect. This would be the result if the show method in B called super.show() after printing B.

- E - Incorrect. References declared of the superclass type can be assigned objects of the subclass. Since there is a show method in the superclass a runtime error does not occur. With inheritance we are allowed to override a method from the superclass in the subclass.



**Question 12**
- A - Incorrect. The only time x && y is true is when both x and y are true. When x and y are both true, (x || y) is true and !(x ||y) is false. Therefore,  (x && y) && !(x || y) will always be fals

- B - Correct. As a result of De Morgan’s Law, the value of !(x || y) is equivalent to !x && !y. The only time x && y is true is when both x and y are true. When x and y are both true, !x && !y is false. Therefore, (x && y) && (!x && !y) will always be false as will (x && y) && !(x ||y).

- C - Correct. When x and y are both true, (x && y) is true and (x || y) is true however, !(x ||y) is false. Therefore, (x && y) && !(x || y) will always be false.

- D -Incorrect. When x and y are both true, (x && y) is true and (x || y) is true meaning !(x ||y) is false. Therefore, (x && y) && !(x || y) will always be false.

- E - Incorrect. When x is true and y is false, (x && y) is false and (x || y) is true meaning !(x ||y) is false. Therefore,(x && y) && !(x || y) will be false.

**Question 19**
- A - Incorrect. In condition II, the while loop will execute one time, since 1, the value of x is less than or equal to 1, however, 1 is not even, so nothing will be printed. The value of x will then be incremented to 3, which is not less than or equal to 1, and the loop will terminate. When the condition is x < 10, as in condition III, the while loop will execute for x having the value 1, 3, 5, 7, and 9. When x becomes 11 the loop will terminate. Even though the loop executes multiple times, the values assigned to x are not even, so nothing is printed.

- B -Incorrect. In condition I, the while loop will not execute, since 1, the value of x, is not less than 0, so nothing will be printed. In condition III, the while loop will execute for x having the value 1, 3, 5, 7, and 9. When x becomes 11 the loop will terminate. Even though the loop executes multiple times, the values assigned to x are not even, so nothing is printed.

- C - Incorrect. In condition III, the while loop will execute for x having the value 1, 3, 5, 7, and 9. When x becomes 11 the loop will terminate. Even though the loop executes multiple times, the values assigned to x are not even, so nothing is printed.

- D - Incorrect. In condition II, the while loop will execute one time, since 1, the value of x is less than or equal to 1, however, 1 is not even, so nothing will be printed. The value of x will then be incremented to 3, which is not less than or equal to 1, and the loop will terminate.

- E - Correct. In condition I, the while loop will not execute, since 1, the value of x, is not less than 0, so nothing will be printed. In condition II, the while loop will execute one time, since 1, the value of x is less than or equal to 1, however, 1 is not even, so nothing will be printed. The value of x will then be incremented to 3, which is not less than or equal to 1, and the loop will terminate. In condition III,  the while loop will execute for x having the value 1, 3, 5, 7, and 9. When x becomes 11 the loop will terminate. Even though the loop executes multiple times, the values assigned to x are not even, so nothing is printed.


**Research Insertion Sort. It was a guess. Quesstion 23 and 26**


**Question 31**
- A - Incorrect. This image would require loops across the entire board with alternating checks for when rows and columns were even or odd.

- B - Incorrect. This image would require loops across the entire board with alternating checks for when rows and columns were even or odd.

- C - Incorrect. This image could be accomplished by iterating board and setting all locations where row == col to “X” and all locations where row + column == board.length-1 to “X”.

- D -Incorrect. This image would require the second set of nested loops to initialize row to val – 1, increment both row and col in each iteration inner loop (instead of row being decremented) and changing the condition on the inner loop to col < 5 && row < 5.

- E - Correct. The first set of nested for loops sets each element in board to “O”. The next for loop starts val at 0 and increments by 1 until val is 4, when val is 5 the loop terminates. When val is even, board is not updated, so nothing happens when val is 0. When val is 1, row is assigned 1 and col is assigned 0. The boolean condition in the while loop is true, so board[1][0] is assigned “X”. Then col is incremented to 1 and row is decremented to 0 and board[0][1] is assigned “X”. Then col is incremented to 2 and row is decremented to -1 and the while loop terminates. When val is 2, nothing changes about board. When val is 3, row is assigned 3 and col is assigned 0. The boolean condition in the while loop is true, so board[3][0] is assigned “X”. Then col is incremented to 1 and row is decremented to 2 and board[2][1] is assigned “X”. Then col is incremented to 2 and row is decremented to 1 and board[1][2] is assigned “X”. Then col is incremented to 3 and row is decremented to 0 and board[0][3] is assigned “X”. Finally, col is incremented to 4 and row is decremented to -1 and the while loop terminates. When val is 4, nothing changes about board.