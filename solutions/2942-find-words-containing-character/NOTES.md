# 2942 — Find Words Containing Character

- Problem: https://leetcode.com/problems/find-words-containing-character/
- Topic: String arrays, indexOf, ArrayList
- Solved: 28 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Full code provided during guided learning; learner reported acceptance after submission.

## Approach

Check each word for character x using indexOf. If found, append the word's index to the result list.
Return all matching word indexes. Each word is added only once, even when x occurs several times within it.

## Java concepts

- `List<Integer>` describes a list of integer values.
- `new ArrayList<>()` creates an empty list that can grow as matches are found.
- `words[i]` selects the word at index i.
- `words[i].indexOf(x)` returns the first occurrence's character index, or -1 if absent.
- `result.add(i)` saves the word index i, not the character position returned by indexOf.
- If no words match, result stays empty and is returned as an empty list.
- Import java.util.ArrayList and java.util.List to use these types.
- The input array is unchanged.

## Trace

Input: words = [cat, dog, cup], x = c (each word is a String)

| Word index | Word | Contains c? | Result afterward |
| --- | --- | --- | --- |
| 0 | cat | Yes | [0] |
| 1 | dog | No | [0] |
| 2 | cup | Yes | [0, 2] |

Return [0, 2]. Both matches are included.

## Complexity

- Time: O(C), where C is the total number of characters across the words, as a worst-case bound for searching each word.
- Output space: O(k), where k is the number of matching words (at most words.length).
- Auxiliary space excluding the result list: O(1).

## Local validation

Compiled with Java 26 and passed 9 cases: all three official examples, the sun/moon/star and cat/dog/cup teaching examples, repeated characters within one word, a single nonmatching word, a match only in the last word, and 50 matching words of length 50. Verified exact expected index lists and unchanged input.
