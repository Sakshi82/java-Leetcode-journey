# 1672 — Richest Customer Wealth

- Problem: https://leetcode.com/problems/richest-customer-wealth/
- Topic: Two-dimensional arrays, nested loops, row sums, maximum
- Reviewed: 24 October 2026
- LeetCode result: Not yet confirmed by the learner.
- Solution: Learner's code, with formatting adjusted only.

## Approach

Each row represents one customer, and each value in that row is an account balance.
The outer loop selects a customer. The inner loop adds that customer's balances.
Compare the completed row sum with the largest wealth seen so far, then return the largest.

## Java details

- `int[][]` is an array of integer arrays.
- `accounts.length` gives the number of customer rows.
- `accounts[i].length` gives the number of balances in row i.
- `accounts[i][j]` reads balance j for customer i.
- `sum` resets to zero inside the outer loop, so each customer gets a separate total.
- `max` starts once, before the outer loop, and remembers the largest total across customers.
- Comparing after the inner loop ensures the customer's complete wealth is used.
- Starting max at zero works for this problem's positive balances.
- The input array is unchanged.

## Trace

Input: `[[1, 5], [7, 3], [3, 5]]`

| Customer index | Row sum | max afterward |
| --- | --- | --- |
| 0 | 1 + 5 = 6 | 6 |
| 1 | 7 + 3 = 10 | 10 |
| 2 | 3 + 5 = 8 | 10 |

Return 10, the richest customer's total wealth.

## Complexity

- Time: O(m * n), for m customers and n accounts per customer; every balance is visited once.
- Extra space: O(1), using only counters and totals.

## Local validation

Compiled with Java 26 and passed 9 cases: three standard examples, a single balance, one customer, one account per customer, the richest customer first, the richest customer last, and a 50-by-50 array of balances equal to 100. Verified expected wealth and preservation of the input in every case.
