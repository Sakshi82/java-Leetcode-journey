# 1929 — Concatenation of Array

- Problem: https://leetcode.com/problems/concatenation-of-array/
- Topic: Arrays, loops, indexing
- Solved: 24 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Store the input length in `n`. Create a new array with `2 * n` slots.
For each input index `i`, copy its value to `result[i]` in the first half and `result[i + n]` in the second half.
Return the new array. The input array is unchanged.

## Trace

Input: `[1, 2, 3]`, n = 3

| Step | Positions filled | Result afterward |
| --- | --- | --- |
| i = 0 | 0 and 3 | [1, 0, 0, 1, 0, 0] |
| i = 1 | 1 and 4 | [1, 2, 0, 1, 2, 0] |
| i = 2 | 2 and 5 | [1, 2, 3, 1, 2, 3] |

The first half uses indexes 0 through n - 1. The second half uses n through 2 * n - 1.
These ranges cover every output slot exactly once.

## Java reminders

- `n` is an integer length; it cannot be indexed as `n[i]`.
- Use the exact input name `nums`, not `num`.
- `=` assigns a value. `==` compares values.
- Finish each assignment with a semicolon.

## Complexity

- Time: O(n), with two assignments per iteration.
- Output space: O(n), for the 2n-element result array.
- Auxiliary space excluding the returned array: O(1).

## Local validation

Compiled with Java 26 and passed 6 cases: `[1,2,1]`, `[1,3,2,1]`, `[7]`, `[2,2,2]`, `[1,2,3]`, and a 1000-element input containing values 1 through 1000. Checked output length, both copies, and preservation of the input.
