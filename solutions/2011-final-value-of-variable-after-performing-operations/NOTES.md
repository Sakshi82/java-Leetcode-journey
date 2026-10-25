# 2011 — Final Value of Variable After Performing Operations

- Problem: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
- Topic: String arrays, character indexing, loops, counters
- Solved: 25 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Start x at zero. Visit every operation once.
For all four allowed operations, the middle character identifies the action:

| Operation | Character at index 1 | Action |
| --- | --- | --- |
| ++X | + | Add one |
| X++ | + | Add one |
| --X | - | Subtract one |
| X-- | - | Subtract one |

Increase x if the middle character is +; otherwise decrease x.
Return x after processing the entire array.
The problem guarantees that every operation is one of these four strings.

## Java concepts

- String indexes start at zero, so the middle of a three-character string is index 1.
- `operations[i]` selects an operation; `.charAt(1)` reads its middle character.
- Use single quotes for the character literal '+'.
- `==` compares the two char values.
- `x++` adds one; `x--` subtracts one.
- x starts before the loop so its value is retained across operations.
- The operation strings are inspected as data, not executed as Java code.

## Trace

Input: [--X, X++, X++] (each operation is a String)

| Step | x afterward |
| --- | --- |
| Start | 0 |
| --X | -1 |
| X++ | 0 |
| X++ | 1 |

Return 1.

## Complexity

- Time: O(n), where n is the number of operations.
- Extra space: O(1).
- The input array is unchanged.

## Local validation

Compiled with Java 26 and passed 10 cases: the three official examples, each of the four operations individually, a mixed sequence ending negative, 100 increments, and 100 decrements. Verified expected totals and unchanged input in every case.
