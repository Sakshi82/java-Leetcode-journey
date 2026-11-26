# 2520 — Count the Digits That Divide a Number

- Problem: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
- Topic: While loops, remainder, digit extraction, counting
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

Keep `num` unchanged so each digit is tested against the original whole number. Use `copy` to extract digits from right to left: `copy % 10` gets the last digit, then `copy /= 10` removes it. When `num % digit == 0`, that digit divides num evenly, so increment count. The problem guarantees digits are nonzero.

Example: num = 12. Extract 2, then 1. Both divide 12 evenly, so return 2.

Time: O(d), where d is the number of digits. Extra space: O(1).
