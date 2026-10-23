# Lesson 1: Arrays, loops, and a running total

## An array stores several values

```java
int[] marks = {10, 20, 30};
```

`int[]` means an array of integers. `marks` is its name.
Positions (indexes) start at **0**: `marks[0]` is 10, `marks[1]` is 20, and `marks[2]` is 30.
`marks.length` is 3. The last valid index is `marks.length - 1`.
Accessing `marks[3]` causes an array index error.

## A loop visits each element

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

- `int i = 0`: start at index zero.
- `i < marks.length`: continue while the index is valid.
- `i++`: increase the index by one after each visit.

## An accumulator remembers a total

```java
int total = 0;
for (int i = 0; i < marks.length; i++) {
    total += marks[i];
}
```

`total += marks[i]` means `total = total + marks[i]`.
For this example, total changes from 0 to 10 to 30 to 60.
Put `total` before the loop so it is not reset on every iteration.
This loop takes O(n) time: it visits n values. The extra total and index use O(1) space.

## Concept check

Before coding, answer:

1. For `int[] nums = {2, 4, 6}`, what are `nums[0]`, `nums.length`, and the last valid index?
2. Why do we use `i < nums.length` rather than `i <= nums.length`?
3. What is the running total after reading the first two numbers?

## Your first problem

[LeetCode 1480 — Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

For each position, return the sum of all input values up to and including that position.
For `[2, 4, 6]`, the output should be `[2, 6, 12]`.

Start with a separate output array; we can discuss modifying the input later.

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int total = 0;

        // TODO: visit each index, update total, and store it in result.

        return result;
    }
}
```

`public int[] runningSum(int[] nums)` describes a method that receives an integer array and returns an integer array.
`new int[nums.length]` creates an output array with the same number of slots, initially all zero.
`return result` sends the answer back to the caller.

Trace your code on `[2, 4, 6]`, `[5]`, `[0, 0]`, and `[3, -1, 2]`.
Send your attempt, even if it is unfinished. We will start with hints and discuss why each line works.
