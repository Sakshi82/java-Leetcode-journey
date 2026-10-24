# 1480 — Running Sum of 1d Array

- Problem: https://leetcode.com/problems/running-sum-of-1d-array/
- Topic: Arrays, prefix sums
- Solved: 24 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with spacing adjusted only.

## Approach

Update the input array directly. Start at index 1 because the first element is already its own running sum.
At each index, add the previous element, which now contains the sum of all earlier input values.
Return the updated array.

## Trace

Input: `[2, 4, 6]`

| Step | Calculation | Array afterward |
| --- | --- | --- |
| i = 1 | 4 + 2 = 6 | [2, 6, 6] |
| i = 2 | 6 + 6 = 12 | [2, 6, 12] |

At i = 2, the previous value is the updated 6, not the original 4.
This reuse of earlier totals is the prefix sum idea.

## Java details

- `i = 1` also makes `nums[i - 1]` safe: its first index is 0.
- `i < nums.length` keeps the current index inside the array.
- `i++` moves to the next index.
- `return nums` returns the same array after modification.
- A one-element array needs no updates; the loop is skipped.

## Complexity

- Time: O(n), one traversal.
- Extra space: O(1), no second array.
- This approach modifies the caller's input array.

## Local validation

Compiled with Java 26 and passed 8 local cases: `[1,2,3,4]`, `[2,4,6]`, `[5]`, `[0,0]`, `[3,-1,2]`, `[-2,-3,-4]`, `[1000000,1000000]`, and a 1000-element array containing 1000000 at every position. All outputs matched the expected running sums.
