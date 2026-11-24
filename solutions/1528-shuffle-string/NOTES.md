# 1528 — Shuffle String

- Problem: https://leetcode.com/problems/shuffle-string/
- Topic: Strings, character arrays, destination indexes
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

For each original position i, indices[i] gives the destination position for s.charAt(i). Create a char array the same length as s, place each character at its destination, then convert the completed array back into a String.

Example: s = "abc", indices = [1,2,0]. Place a at 1, b at 2, c at 0. The result array is ['c','a','b'], which becomes "cab".

Time: O(n). Output space: O(n) for the character array and returned string.
