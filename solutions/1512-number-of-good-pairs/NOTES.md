# 1512 — Number of Good Pairs

- Problem: https://leetcode.com/problems/number-of-good-pairs/
- Topic: Arrays, nested loops, pair enumeration
- Reviewed: 24 October 2026
- LeetCode result: Not yet confirmed by the learner.
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

A good pair has equal values at two different indexes, with i < j.
The outer loop picks index i. The inner loop visits only indexes after i.
If the two values match, increase count. Return the total after checking all pairs.

## Why j starts at i + 1

- It guarantees i < j.
- It avoids pairing an element with itself.
- It checks each pair once, avoiding reversed duplicates such as (0, 1) and (1, 0).

## Trace

Input: `[1, 1, 1]`

| i | j | Match? | count afterward |
| --- | --- | --- | --- |
| 0 | 1 | Yes | 1 |
| 0 | 2 | Yes | 2 |
| 1 | 2 | Yes | 3 |

At i = 2, j starts at 3, so the inner loop is skipped. Return 3.
Equal values at different indexes create different pairs.

## Complexity

- Time: O(n squared), checking n * (n - 1) / 2 pairs.
- Extra space: O(1), using only indexes and a counter.
- The input array is unchanged.

This direct approach is suitable for learning pair enumeration. A frequency-counting approach can be studied later when learning maps.

## Local validation

Compiled with Java 26 and passed 9 cases: `[1,2,3,1,1,3]` -> 4; `[1,1,1,1]` -> 6; `[1,2,3]` -> 0; `[7]` -> 0; `[5,5]` -> 1; `[5,6]` -> 0; `[1,1,1]` -> 3; `[1,2,1,2]` -> 2; and 100 equal values -> 4950. Verified preservation of the input in every case.
