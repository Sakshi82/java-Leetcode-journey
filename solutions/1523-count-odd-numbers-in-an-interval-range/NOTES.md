# 1523 — Count Odd Numbers in an Interval Range

- Problem: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
- Topic: Integer arithmetic, integer division, counting intervals
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

`(x + 1) / 2` counts odd numbers from 0 through x. Therefore `(high + 1) / 2` counts odds through high, and `low / 2` counts odds strictly below low. Subtract to count odds in the inclusive interval [low, high]. Java integer division truncates the fractional part.

Example: low = 4, high = 10 gives 11 / 2 - 4 / 2 = 5 - 2 = 3 (5, 7, 9).

Time: O(1). Extra space: O(1).
