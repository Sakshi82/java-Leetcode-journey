# 1313 — Decompress Run-Length Encoded List

- Problem: https://leetcode.com/problems/decompress-run-length-encoded-list/
- Topic: Arrays, nested loops, output sizing
- LeetCode result: Accepted (learner-reported).
- Solution: Learner's submitted code, formatted for readability.

The input is made of pairs `[frequency, value]`. First sum all frequencies to determine the exact output array length. Then visit each pair and write its value into the result `frequency` times. `position` tracks the next open result index.

Example: `[2,5,1,4]` has output size 3. Repeat 5 twice and 4 once to get `[5,5,4]`.

Time: O(m + r), where m is the encoded input length and r is the decompressed output length. Extra/output space: O(r).
