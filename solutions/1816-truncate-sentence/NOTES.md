# 1816 — Truncate Sentence

- Problem: https://leetcode.com/problems/truncate-sentence/
- Topic: Strings, split, array ranges, join
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code; added `java.util.Arrays` import for `copyOfRange`.

Split the sentence at each space to create a word array. `Arrays.copyOfRange(words, 0, k)` copies indexes 0 through k - 1. `String.join(" ", firstWords)` joins them with one space.

Example: "I love solving problems", k = 2 -> ["I", "love"] -> "I love".

Time and output space: O(n), where n is the sentence length.
