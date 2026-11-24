# 2037 — Minimum Number of Moves to Seat Everyone

- Problem: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
- Topic: Arrays, sorting, absolute difference
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code; added the required `java.util.Arrays` import.

Sort both arrays so the smallest student is paired with the smallest seat, and so on. Add `Math.abs(seats[i] - students[i])` for every pair. For seats [3,1,5] and students [2,7,4], sorting gives [1,3,5] and [2,4,7]; movement is 1 + 1 + 2 = 4.

Time: O(n log n) due to sorting. Extra space: depends on the sorting implementation; the algorithm uses O(1) additional variables beyond sorting.
