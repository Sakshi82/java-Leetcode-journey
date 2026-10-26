# 1920 — Build Array from Permutation

- Problem: https://leetcode.com/problems/build-array-from-permutation/
- Topic: Arrays, indexes and values, indirect lookup
- Solved: 26 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Create a result array with the same length as nums.
At each position i, read nums[i] into nextIndex, then read nums[nextIndex] into result[i].
This is equivalent to result[i] = nums[nums[i]], but separates the two lookups for clarity.
The problem's input contains each integer from zero to nums.length - 1 exactly once, so each nextIndex is valid.

## Index versus value

An index is a position; the value is the number stored at that position.
For nums = [2, 0, 1], index 0 holds 2, index 1 holds 0, and index 2 holds 1.
Here each value can also be used as a second index.

## Trace

Input: [2, 0, 1]

| i | nextIndex = nums[i] | result[i] = nums[nextIndex] |
| --- | --- | --- |
| 0 | 2 | nums[2] = 1 |
| 1 | 0 | nums[0] = 2 |
| 2 | 1 | nums[1] = 0 |

Return [1, 2, 0].
The separate result array keeps the original values available throughout the loop.

## Complexity

- Time: O(n), with two input lookups per iteration.
- Output space: O(n), for the result array.
- Auxiliary space excluding the returned array: O(1).
- The input array is unchanged.

## Local validation

Compiled with Java 26 and passed 7 cases: both official examples, [2,0,1], [0], [1,0], an identity permutation, and a 1000-element reversed permutation. Verified expected result contents, a separate output array, and preservation of the input in every case.
