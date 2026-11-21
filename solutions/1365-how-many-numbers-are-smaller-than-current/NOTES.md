# 1365 — How Many Numbers Are Smaller Than the Current Number

- Problem: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
- Topic: Arrays, nested loops, comparisons, counting
- Worked on: 21 November 2026
- LeetCode result: Not yet reported.
- Solution: Learner's code, with formatting adjusted only.

## Approach

For each position i, count all positions j whose value is strictly less than nums[i]. Store that count at answer[i]. Return the answer array.

Duplicates count separately when they are smaller. Equal values do not count because the comparison uses `<`. The inner loop may include i: a value is never strictly smaller than itself.

## Trace

Input: [4, 1, 3]

| i | nums[i] | Smaller values | answer[i] |
| --- | --- | --- | --- |
| 0 | 4 | 1, 3 | 2 |
| 1 | 1 | none | 0 |
| 2 | 3 | 1 | 1 |

Return [2, 0, 1].

## Complexity

- Time: O(n²), because each of n values is compared against all n values.
- Extra space: O(n) for the returned answer array; O(1) other working space.
- The input array is unchanged.

## Local validation

Pending.
