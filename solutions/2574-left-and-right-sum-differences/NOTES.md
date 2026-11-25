# 2574 — Left and Right Sum Differences

- Problem: https://leetcode.com/problems/left-and-right-sum-differences/
- Topic: Arrays, nested loops, sums, absolute difference
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

For each index i, sum values strictly before i and strictly after i. The current element is excluded from both sides. Store the absolute difference between those sums.

Example: nums = [2,5,1]. At index 1, leftSum = 2 and rightSum = 1, so the result is 1. The full output is [6,1,7].

Time: O(n²), since each position recomputes sums by scanning both sides. Extra space: O(n) for the answer; O(1) working space.
