# 2413 — Smallest Even Multiple

- Problem: https://leetcode.com/problems/smallest-even-multiple/
- Topic: Remainder, conditionals, multiples
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

If n is even, it is already the smallest positive multiple shared by n and 2, so return n. If n is odd, its next multiple, 2*n, is even and is the smallest shared multiple. `n % 2 == 0` checks evenness because even numbers have remainder zero when divided by 2.

Time: O(1). Extra space: O(1).
