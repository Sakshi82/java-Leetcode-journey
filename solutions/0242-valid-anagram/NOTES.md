# 242 — Valid Anagram

- Problem: https://leetcode.com/problems/valid-anagram/
- Topic: Strings, character arrays, sorting, array comparison
- Reviewed: 25 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## What the question asks

Two words are anagrams if rearranging the letters of one makes the other.
Every letter must occur the same number of times. Order can differ.
For example, cat and act are anagrams, but egg and gee are not.

## Approach: convert, sort, compare

1. Convert s and t into separate character arrays.
2. Sort both arrays into character order.
3. Compare their contents using Arrays.equals.

Sorting puts equal collections of letters into the same order, so the sorted arrays match exactly when the words are anagrams.
Different lengths also produce unequal arrays.

## Trace

For s = cat and t = act:

- Conversion keeps the original order: [c, a, t] and [a, c, t].
- Sorting produces [a, c, t] and [a, c, t].
- Arrays.equals returns true.

For rat and car, the sorted arrays are [a, r, t] and [a, c, r], so return false.

## Java concepts and fixes learned

- toCharArray converts a string; it does not sort or reverse it.
- Arrays.sort sorts an array in place. No explicit loop is needed in this method.
- Use Arrays with a final s, and import java.util.Arrays.
- Arrays.equals compares array contents, including lengths.
- Build second from t, not s. Copying s twice incorrectly makes every comparison true.
- Declare arrays in the method scope so the return statement can access them.
- The earlier letter-counting idea is a separate approach; no counts array is needed here.
- Both original Strings remain unchanged.

## Complexity

- Time: O(n log n + m log m), for string lengths n and m, using the standard sorting bound.
- Extra space: O(n + m), for the character array copies.

## Local validation

Compiled with Java 26 and passed 12 cases: anagram/nagaram, rat/car, cat/act, aab/abb, egg/gee, single matching and different letters, unequal lengths in both directions, dog/god, and two 50000-character cases with matching and mismatched letter counts.
