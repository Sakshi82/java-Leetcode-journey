# 1295 — Find Numbers with Even Number of Digits

- Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
- Topic: Arrays, loops, integer division, counting
- Solved: 24 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Visit each value. Copy it into `number`, then repeatedly divide that copy by 10 until it reaches zero.
Each division removes one digit, so increase `digits` for each division.
If the final digit count is even, increase `count`. Return `count` after visiting every value.
The problem guarantees positive integers from 1 through 100000; this digit-counting loop uses that guarantee.

## Three variables with separate jobs

| Variable | Job | Reset when? |
| --- | --- | --- |
| number | Remaining part of the current number | Copy nums[i] for each array element |
| digits | Number of digits in the current number | Start at zero for each array element |
| count | Total qualifying numbers | Start at zero once, before the for loop |

## Trace

For 123: number changes 123 -> 12 -> 1 -> 0 while digits changes 0 -> 1 -> 2 -> 3.
Three is odd, so count does not increase.

For `[12, 345, 7896]`:

| Value | Digits | Count afterward |
| --- | --- | --- |
| 12 | 2 | 1 |
| 345 | 3 | 1 |
| 7896 | 4 | 2 |

## Java reminders

- Divide `number`, not `digits`, so the while loop eventually stops.
- Increase `digits` inside the while loop.
- Put the even check after the while loop, when digit counting is complete.
- `digits % 2 == 0` checks whether the digit count is even.
- Increase `count` only inside that if statement.
- Copying nums[i] into a local integer keeps the input array unchanged.

## Complexity

- General time: O(n * d), where d is the maximum number of digits in an input value.
- Under this problem's bound, d is at most 6, so time is O(n).
- Extra space: O(1).

## Local validation

Compiled with Java 26 and passed 8 cases: both official examples, `[1]`, `[10]`, `[100000]`, digit boundaries from 1 through 100000, `[12,345,7896]`, and a 500-element array of 100000. Verified expected counts and preservation of the input in every case.
