# 771 — Jewels and Stones

- Problem: https://leetcode.com/problems/jewels-and-stones/
- Topic: Strings, membership checks, counting
- Solved: 27 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Visit every character in stones. Search for that character in jewels using indexOf.
If the search finds it, increase count. Return count after checking all stones.
Repeated stones count separately. Uppercase and lowercase letters are different.

## Java concepts

- stones.charAt(i) reads one stone character.
- jewels.indexOf(stone) returns the first matching index, or -1 if absent.
- Index zero is a successful match too; use != -1, not > 0.
- != means not equal, so != -1 means found.
- count++ increases the total by one.
- Neither input String is changed.

## Trace

Input: jewels = aA, stones = aAb

| Stone | indexOf result | count afterward |
| --- | --- | --- |
| a | 0 | 1 |
| A | 1 | 2 |
| b | -1 | 2 |

Return 2. With jewels = a instead, uppercase A would not qualify, so return 1.

## Complexity

- Time: O(S * J) in the worst case, where S is the number of stones and J is the number of jewel types. indexOf may scan the jewels string for each stone.
- Extra space: O(1).

## Local validation

Compiled with Java 26 and passed 10 cases: both official examples, case-sensitive teaching examples, repeated qualifying stones, a match at jewel index zero, no match, a match at the last jewel index, 50 repeated stones, and 50 unique jewel types with 50 matching stones. Checked exact expected counts.
