## Exercise #5.1 Reverse Integers

Write a Java method `void reverseInts(int[] nums)` that reverse the values within the input array.

You must reverse the values in-place by swapping and not create a new array.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/reverse.png" alt="" style="float: left" height=300 />

Test cases :

```
reverseInts([1, 2, 3, 4, 5]) → [5, 4, 3, 2, 1]
reverseInts([1, 2, 3, 4]) → [4, 3, 2, 1]
```



## Exercise #5.2 Copy Even Indices

Write a Java method `int[] copyEven(int[] nums)` that copy elements at even indices to a new array.

It must return the new array of the correct length with those elements inside.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/firstarrayindex.png" alt="" style="float: left" height=300 />

Test cases :

```
copyEven([1, 2, 3]) → [1, 3]
copyEven([1, 2, 3, 4]) → [1, 3]
```



## Exercise #5.3 A Diamond is FORever

Write a Java method `void diamond(int n)` that takes an ***odd*** integer argument `n` and prints an `n`-by-`n` pattern like the test cases below, with an *asterisk* (`*`) for each element which makes up a diamond, and a *dot* (`.`) for each entry that is not, and *one space* between each `*` or `.`

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/diamondAce.png" alt="" style="float: left" height=200 />



Test cases :

```
diamond(5)
```

```
. . * . .

. * * * .

\* * * * *

. * * * .

. . * . .
```



```
diamond(9)
```

```
. . . . * . . . .

. . . * * * . . .

. . * * * * * . .

. * * * * * * * .

* * * * * * * * *

. * * * * * * * .

. . * * * * * . .

. . . * * * . . .

. . . . * . . . .
```



## Exercise #5.4 Arithmetic Series

Write a Java method `int[] arithSeries(int n)` that on input an integer `n >= 0`, outputs an array with the pattern `[1, 1, 2, 1, 2, 3, ....., 1, 2, 3, ..., n]`.

Note that the length of the array will be 1 + 2 + 3 ... + n, which was famously derived by **Gauss** to sum to exactly n*(n + 1)/2.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/Gauss.jpg" alt="" style="float: left" height=200 />

Test cases :

```
arithSeries(2) → [1, 1, 2]
arithSeries(3) → [1, 1, 2, 1, 2, 3]
arithSeries(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
```

For example:

```
printInts(arithSeries(2));
[1, 1, 2]
printInts(arithSeries(3));
[1, 1, 2, 1, 2, 3]
printInts(arithSeries(4));
[1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
```



## CW1 #5.1 Band Matrix

Write a Java method `void bandMatrix(int n, int width)` that takes two integer arguments `n` and `width` and prints an `n`-by-`n` pattern like the ones below, with a *zero* (`0`) for each element whose distance from the main diagonal is strictly more than `width`, and an *asterisk* (`*`) for each entry that is not, and *two spaces* between each `0` or `*`.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/bandmatrix.png" alt="" style="float: left" height=200 />

Note that distance here would be the minimal number of times you move up/down/left/right to get to get to any diagonal entries




Test cases :

```
bandMatrix(4, 0)
```

```
*  0  0  0
0  *  0  0
0  0  *  0
0  0  0  *
```



```
bandMatrix(4, 1)
```

```
*  *  0  0
*  *  *  0
0  *  *  *
0  0  *  *
```



```
bandMatrix(4, 2)
```

```
*  *  *  0
*  *  *  *
*  *  *  *
0  *  *  * 
```

## CW1 #5.2 Even Odd Swap

rite a Java method `int[] evenOddSwap(int[] nums)` that given an integer array containing the same number of even and odd numbers,
swap all pairs of even and odd numbers in the order of their appearance.

<img src="/home/ous50/Nextcloud/XJTLU/XJTLU-CPT111/homework.assets/oddeven.jpg" alt="" style="float: left" height=200 />



Test cases :
evenOddSwap([1, 2, 3, 4]) → [2, 1, 4, 3]

evenOddSwap([100, 25]) → [25, 100]

evenOddSwap([]) → []

evenOddSwap([11, 55, 100, 200, 300, 7]) → [100, 200, 11, 55, 7, 300]