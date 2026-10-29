# 1431 — Kids With the Greatest Number of Candies

- Problem: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
- Topic: Arrays, maximum, comparisons, List<Boolean>
- Solved: 29 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

First find the largest candy count using one loop.
Then check each child independently: would their candy count plus all extra candies reach or exceed that maximum?
Append the comparison's boolean result to the list and return it.
Ties qualify. These are separate what-if checks, so the extra candies are not consumed between children.
The original candies array is unchanged.

## Java concepts

- max starts at zero, which is suitable for this problem's positive candy counts.
- The first loop finishes before the second loop so every child is compared against the same complete maximum.
- >= means greater than or equal to. = assigns a value instead of comparing.
- `List<Boolean>` stores true/false values, unlike the List<Integer> used in problem 2942.
- `new ArrayList<>()` creates a list that grows as results are added.
- `result.add(candies[i] + extraCandies >= max)` directly adds the comparison's true/false value.

## Trace

Input: candies = [1, 4, 2], extraCandies = 2

The first loop finds max = 4.

| Original candies | With extras | At least 4? |
| --- | --- | --- |
| 1 | 3 | false |
| 4 | 6 | true |
| 2 | 4 | true |

Return [false, true, true].

## Complexity

- Time: O(n), two sequential loops over n children.
- Output space: O(n), one boolean result per child.
- Auxiliary space excluding the output list: O(1).

## Local validation

Compiled with Java 26 and passed 9 cases: all three official examples, the [1,4,2] teaching example, equal starting counts, a large gap with the maximum first or last, an exact tie after extras, and 100 children each starting with 100 candies and 50 extras. Verified expected boolean lists and unchanged input in every case.
