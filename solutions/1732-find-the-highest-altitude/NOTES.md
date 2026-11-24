# 1732 — Find the Highest Altitude

- Problem: https://leetcode.com/problems/find-the-highest-altitude/
- Topic: Arrays, running totals, maximum tracking
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

The cyclist starts at altitude 0. Each gain changes the current altitude, so add every `gain[i]` to `altitude`. After each change, update `highest` when the new altitude is larger. Initialize `highest` to 0 because the starting point counts, even if every gain is negative.

For gain = [-2, 3], altitudes are 0, -2, 1; the highest is 1.

Time: O(n). Extra space: O(1).
