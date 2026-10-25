# 1470 — Shuffle the Array

- Problem: https://leetcode.com/problems/shuffle-the-array/
- Topic: Arrays, indexing, interleaving
- Solved: 26 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

The input contains two halves of length n. Interleave them into a new array.
For each index i in the first half, its partner in the second half is at i + n.
Place the pair at result indexes 2 * i and 2 * i + 1.
The loop runs n times and fills two output slots each time.

## Trace

Input: nums = [1, 2, 3, 4], n = 2

| i | Values read | Output indexes | Result afterward |
| --- | --- | --- | --- |
| 0 | nums[0] = 1, nums[2] = 3 | 0, 1 | [1, 3, 0, 0] |
| 1 | nums[1] = 2, nums[3] = 4 | 2, 3 | [1, 3, 2, 4] |

## Why the indexes work

- i visits 0 through n - 1 in the first half.
- i + n visits n through 2n - 1 in the second half.
- 2 * i fills the even output indexes; 2 * i + 1 fills the odd indexes.
- Every output slot is filled exactly once, in the required order.
- The input array remains unchanged.

## Complexity

- Time: O(n), one loop with two assignments per iteration.
- Output space: O(n), for the new array of length 2n.
- Auxiliary space excluding the returned array: O(1).

## Local validation

Compiled with Java 26 and passed 7 cases: the three official examples, [1,2,3,4] with n = 2, a single pair, equal values, and a 1000-element input with n = 500. Verified expected output contents, a separate result array, and preservation of the input in every case.
