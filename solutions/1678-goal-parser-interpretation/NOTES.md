# 1678 — Goal Parser Interpretation

- Problem: https://leetcode.com/problems/goal-parser-interpretation/
- Topic: Strings, chained replace calls
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

Replace each `()` with `o`, then replace each `(al)` with `al`. The second replace runs on the String returned by the first call. A standalone `G` remains unchanged.

Example: `G()(al)` -> `Go(al)` -> `Goal`.

Time: O(n), where n is the command length. The returned String uses O(n) space.
