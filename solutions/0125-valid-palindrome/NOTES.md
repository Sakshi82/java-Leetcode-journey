# 125 — Valid Palindrome

- Problem: https://leetcode.com/problems/valid-palindrome/
- Topic: Strings, two pointers, character checks
- Solved: 25 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Read from both ends using left and right indexes. Skip characters that are neither letters nor digits.
Compare the remaining characters after converting each to lowercase.
Return false immediately on a mismatch. Otherwise move both pointers inward.
Return true after the pointers meet or cross, because all relevant pairs matched.

## Java concepts

- A String uses `s.length()` and `s.charAt(index)`, unlike an array's length field and brackets.
- `Character.isLetterOrDigit` recognizes characters to retain; digits count too.
- `!` means not. `!=` means not equal.
- `Character.toLowerCase` makes the comparison ignore letter case.
- `continue` starts the next loop iteration after skipping an unwanted character.
- A boolean method returns true or false.
- Move both pointers after a match, inside the loop, to avoid repeating the same comparison forever.
- Compare characters rather than swapping them; the input String stays unchanged.

## Trace

For `Noon`, compare N and n as lowercase n, then o and o. All comparisons match, so return true.
For `race a car`, r/r, a/a, and c/c match. Then e/a differ after skipping the space, so return false.
For punctuation-only input, the skipping steps exhaust the range and the method returns true.

## Complexity

- Time: O(n). Each pointer moves only inward; each character is visited a constant number of times.
- Extra space: O(1). No cleaned copy or reversed string is created.

## Local validation

Compiled with Java 26 and passed 13 cases: the three official examples, Noon, hello, a single character, punctuation-only input, 0P, 1a1, ab, punctuation on either side of a single letter, and 200000 repeated letters. Checked expected true/false results in every case.
