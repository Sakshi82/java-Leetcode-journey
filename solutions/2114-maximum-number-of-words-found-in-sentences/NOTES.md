# 2114 — Maximum Number of Words Found in Sentences

- Problem: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
- Topic: Strings, nested loops, counting spaces, maximum
- Solved: 26 October 2026
- LeetCode result: Accepted (reported by the learner in chat).
- Solution: Learner's submitted code, with formatting adjusted only.

## Approach

For each sentence, start words at 1 and add one whenever a space is found.
Keep the largest word count in max and return it after all sentences have been processed.
This relies on the problem's guarantees: sentences are nonempty, words have exactly one separating space, and there are no leading or trailing spaces.
Therefore words = number of spaces + 1.

## Variable roles

- i selects a sentence.
- j selects a character in the current sentence.
- words resets to 1 for each sentence; even hello has one word and no spaces.
- max starts once before both loops and remembers the largest count across sentences.
- `' '` is the space character.

## Updating max inside the character loop

The learner's code compares words with max after every character. This is correct because words only increases, and each nonempty sentence's final count is compared by its final character.
A simpler alternative is to move that comparison just after the inner loop, comparing only the completed count once per sentence. Both approaches have the same time complexity.
The commented-out return inside the loop must stay inactive: returning there would stop before all sentences are checked.

## Trace

Input: [i love java, hello world, we practice every day] (each entry is a String)

| Sentence | Spaces | Final words | max after sentence |
| --- | --- | --- | --- |
| i love java | 2 | 3 | 3 |
| hello world | 1 | 2 | 3 |
| we practice every day | 3 | 4 | 4 |

Return 4.

## Complexity

- Time: O(C), where C is the total number of characters across all sentences.
- Extra space: O(1).
- The input is unchanged.

## Local validation

Compiled with Java 26 and passed 10 cases: both official examples, a single word, a single character, two words, the teaching example, the largest count first and last, tied counts, and 100 sentences of 100 characters each. Verified expected maximum counts and unchanged input in every case.
