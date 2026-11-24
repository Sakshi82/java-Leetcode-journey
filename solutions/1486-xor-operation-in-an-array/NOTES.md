# 1486 — XOR Operation in an Array

- Problem: https://leetcode.com/problems/xor-operation-in-an-array/
- Topic: Loops, arithmetic, bitwise XOR
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

For each index i from 0 to n - 1, the generated value is start + 2 * i. XOR each value into answer, initially zero. For n = 4 and start = 3, the values are 3, 5, 7, 9 and the running XOR is 3, 6, 1, 8.

XOR (`^`) compares bits: equal bits produce 0 and different bits produce 1. The loop takes O(n) time and O(1) extra space.
