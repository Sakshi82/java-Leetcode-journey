# 2235 — Add Two Integers

- Problem: https://leetcode.com/problems/add-two-integers/
- Topic: Java methods, integer arithmetic, return values
- Reviewed: 24 October 2026
- LeetCode result: Not yet confirmed by the learner.
- Solution: Learner's code, unchanged.

## Approach

Add the two input integers using `+` and return the result.
For example, sum(12, 5) returns 17, and sum(-10, 4) returns -6.

## Java details

- `int num1` and `int num2` are parameters that receive the input values.
- The `int` before `sum` declares that the method returns an integer.
- `return num1 + num2;` computes the answer and sends it to the caller.
- No loop or extra array is needed.

## Complexity

- Time: O(1), one addition.
- Extra space: O(1).

## Local validation

Compiled with Java 26 and passed 7 cases: (12, 5) -> 17; (-10, 4) -> -6; (0, 0) -> 0; (-4, -6) -> -10; (7, -7) -> 0; (100, 100) -> 200; (-100, -100) -> -200.
