# 14 — Longest Common Prefix

- Problem: https://leetcode.com/problems/longest-common-prefix/
- Topic: String arrays, nested loops, character comparison, substring
- Solved: 25 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## What the question asks

Find the longest beginning shared by every word. A prefix must start at index zero.
For car, cat, and cap, the answer is ca. If the first characters differ, the answer is the empty string.

## Approach

Use the first word as the reference. At each character position i, check every other word j.
If another word ends at that position or has a different character, return the reference word's characters before i.
If the loops finish, the entire first word is a prefix of every word, so return it.
The problem guarantees at least one word. Individual words may be empty; the code handles those too.

## Java concepts

- `strs[j]` selects a word; `strs[j].charAt(i)` selects one character in that word.
- i is the character position; j is the word index.
- `strs.length` is the number of words; `strs[j].length()` is a word's length.
- `substring(0, i)` includes index zero and excludes index i.
- Example: flower.charAt(2) gives o, but flower.substring(0, 2) gives fl (with flower treated as a String).
- `||` means or and short-circuits: when the word has ended, Java skips the character access on the right.
- The length check must precede charAt to avoid accessing a nonexistent character.

## Trace

Input: flower, flow, flight

| Position i | Reference character | Other characters | Action |
| --- | --- | --- | --- |
| 0 | f | f, f | Continue |
| 1 | l | l, l | Continue |
| 2 | o | o, i | Return fl |

For car and ca, the second word ends when i = 2, so return ca.

## Complexity

- Time: O(n * L) as an upper bound, where n is the number of words and L is the first word's length.
- Auxiliary space excluding the returned string: O(1).
- A returned substring can require O(k) output space for a prefix of length k.
- The input array and its strings are unchanged.

## Local validation

Compiled with Java 26 and passed 13 cases: standard examples, car/cat/cap, a shorter word in either position, one word, empty words in either position, all empty words, identical words, one-character prefixes, a mismatch in the final word, and 200 identical 200-character words. Verified expected outputs and unchanged input in every case.
