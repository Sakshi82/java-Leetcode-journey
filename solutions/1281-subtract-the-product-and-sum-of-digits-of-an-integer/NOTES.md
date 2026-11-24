# 1281 — Subtract the Product and Sum of Digits of an Integer

- Problem: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
- Topic: While loops, remainder, integer division, accumulators
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

Each loop gets the last digit with `n % 10`, adds it to `sum`, multiplies it into `product`, then removes it with integer division `n / 10`. When n reaches zero, return product minus sum.

Initialize sum to 0 because addition starts with zero. Initialize product to 1 because multiplying by zero would keep the product at zero.

For n = 352, digits are processed as 2, 5, 3. Sum is 10, product is 30, and the answer is 20. Digit order does not affect addition or multiplication.

Time: O(d), where d is the number of digits. Extra space: O(1).
