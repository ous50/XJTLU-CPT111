## Exercise #4.1 Black Jack

In Black Jack card game, we call a value *busts* if it exceeds a sum of 21.

Write a Java program *BlackJack* that on input 2 integer values greater than 0, prints a single integer of whichever value is nearest to 21 without going bust. Print -1 if both values bust.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/Blackjack-Cards-Image.png" alt="" style="float: left" height=300 />

Test case 1:
Input:
20
19
Output:
20

Test case 2:
19
22
Output:
19

Test case 3:
Input:
22
23
Output:
-1



## Exercise #4.2 Pandemic Spread

Write a Java program *PandemicSpread* to simulate how *fast* a pandemic spread with the following input:

- init : the initial number of infected persons on **day 1**
- numInfect : the average number of healthy people that one infected person **newly infects** per day
- population : the **total number** of people in the area



Return **the day on which the *entire* population** will be infected.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/pandemicspread.png" alt="" style="float: left" height=100 />



<u>Test case 1</u> :
Input:
1
2
10
Output:
4
(Explanation: Total Infected Day 1 = 1; Day 2 = 3; Day 3 = 9; Day 4 = 27)

<u>Test case 2</u>:
Input:
5
3
1000
Output:
5



## CW1 #4.1 Right Triangle

Write a Java program *RightTriangle* that takes three integer input numbers and determines whether they make up the side lengths of a right triangle .

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/right-triangle1.png" alt="" style="float: left" height=300 />

Your program must print output true if and only if the following two conditions are true :

1) **All three integers** are **positive** (greater than zero).
2) You can find two integers where the sum of the squares of those two integers is equal to the square of the third integer.



<u>Test cases 1</u>:
Input:
5
12
13
Output:
true
(since they are all positive and $5^2 + 12^2 == 13^2$)
<u>Test cases 2</u>:
Input:
5
4
3
Output:
true
(since they are all positive and $4^2 + 3^2 == 5^2$)
<u>Test cases 3</u>:
Input:
-3
-4
5
Output:
false
(since -3 and -4 are not positive)



## CW1 #4.2 Hailstone Sequence

The *Hailstone sequence* is computed as follows:

- Start with an integer number n
- If n is even, the next number in the sequence is n/2
- If n is odd, the next number is 3n+1
- Continue until it reaches 1



For example,
for n = 3, the sequence is 3, 10, 5, 16, 8, 4, 2, 1
and for n = 12, the sequence is 12, 6, 3, 10, 5, 16, 8, 4, 2, 1



<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/Hailstone.png" alt="" style="float: left" height=300 />



Write a Java program *HailStone* that on input a **positive integer** n, prints the *length* of the Hailstone sequence starting at n.



<u>Test case 1</u>:
Input:
3
Output:
8

<u>Test case 2</u>:
Input:
12
Output:
10

Note that, interestingly, we still do *not* know whether the Hailstone sequence will ever reaches 1 for all starting n !
This is also known in the literature as the *Collatz conjecture*.



