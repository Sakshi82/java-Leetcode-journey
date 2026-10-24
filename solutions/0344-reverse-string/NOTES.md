# 344 — Reverse String

- Problem: https://leetcode.com/problems/reverse-string/
- Topic: Character arrays, two pointers, swapping
- Solved: 24 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

Start left at the first index and right at the last index.
Swap the characters at those indexes, then move both indexes inward.
Repeat while right > left. When they meet or cross, the array is reversed.
The condition right > left means exactly the same thing as left < right.

## Java details and fixes learned

- `char` holds one character; `char[]` holds an array of characters.
- `temp` saves the left character before that slot is overwritten.
- `left++` and `right--` belong inside the while loop, so each swap advances toward termination.
- The original condition right < left skipped the loop for arrays with more than one element.
- The method returns void: it modifies the input array directly and does not return an array.

## Trace

Input: `['a', 'b', 'c', 'd']`

| Step | left | right | Array after swap |
| --- | --- | --- | --- |
| 1 | 0 | 3 | ['d', 'b', 'c', 'a'] |
| 2 | 1 | 2 | ['d', 'c', 'b', 'a'] |

After moving inward again, left = 2 and right = 1, so the loop stops.
For odd lengths, the middle character stays in place.

## Complexity

- Time: O(n), with floor(n / 2) swaps.
- Extra space: O(1), using two indexes and one temporary character.

## Local validation

Compiled with Java 26 and passed 8 cases: hello -> olleh, Hannah -> hannaH, abcd -> dcba, a -> a, ab -> ba, aaaa -> aaaa, a string containing a space and punctuation, and a 100000-character input. Verified the contents of the modified input array in every case.
