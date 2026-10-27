# 1108 — Defanging an IP Address

- Problem: https://leetcode.com/problems/defanging-an-ip-address/
- Topic: Strings, literal replacement, return values
- Solved: 27 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Replace every dot in the input address with [.] and return the new string.
String.replace performs a literal replacement of every matching occurrence.
The original String remains unchanged.

## Example

Input: 192.168.1.1

Output: 192[.]168[.]1[.]1

Only the three existing dots are replaced. Do not append [.] after the final number.

## Java reminders

- The first argument is the text to find; the second is its replacement.
- Use "." without a trailing space: ". " would search for a dot followed by a space.
- Return the value from replace because Java Strings are immutable.
- No explicit loop or import is needed for this approach.

## Complexity

- General time: O(n), where n is the input string length.
- Output space: O(n), for the returned string.
- A valid IPv4 address has a bounded length and exactly three dots; replacing those adds six characters.

## Local validation

Compiled with Java 26 and passed 6 cases: 1.1.1.1, 255.100.50.0, 192.168.1.1, 0.0.0.0, 255.255.255.255, and 10.0.0.1. Checked exact expected strings and the six-character increase in output length.
