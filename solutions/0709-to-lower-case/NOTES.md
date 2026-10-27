# 709 — To Lower Case

- Problem: https://leetcode.com/problems/to-lower-case/
- Topic: Strings, methods, lowercase conversion
- Solved: 27 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, unchanged.

## Approach

Call the String method toLowerCase and return its result.
Uppercase letters become lowercase. For this problem's ASCII input, lowercase letters, spaces, digits, and punctuation need no changes.

## Example

JaVa Is FUN! -> java is fun!

## Java concepts

- `s.toLowerCase()` calls a method on the input String.
- `return` sends the converted String back to the caller.
- Strings are immutable: calling the method does not modify s itself.
- Unlike Character.toLowerCase, which handles a character, String.toLowerCase handles the whole string.
- No explicit loop or import is needed.
- The no-argument String method uses the default locale. This is the learner's accepted LeetCode version; for locale-independent text conversion in other applications, use `s.toLowerCase(java.util.Locale.ROOT)`.

## Complexity

- Time: O(n), where n is the string length.
- Extra/output space: O(n) in the worst case for the converted string.

## Local validation

Compiled with Java 26 and passed 9 cases under default locale en_IN: Hello, here, LOVELY, JaVa Is FUN!, Hi123!, digits/punctuation/spaces only, a single uppercase letter, all 26 uppercase English letters, and 100 uppercase Z characters. Checked exact expected outputs.
