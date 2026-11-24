# 200 — Number of Islands

- Problem: https://leetcode.com/problems/number-of-islands/
- Topic: Grid traversal, depth-first search
- Language: Java
- LeetCode result: Not submitted

## Approach

Scan every cell. When an unvisited land cell is found, count one island and use an iterative depth-first search to visit all land cells connected to it horizontally or vertically. Mark each visited land cell as water so it is not counted or visited again.

The grid is modified during the search: visited `'1'` cells become `'0'`.

## Complexity

- Time: O(m * n), because each cell is examined and each land cell is visited at most once.
- Extra space: O(m * n) in the worst case for the DFS stack.

## Key detail

Only the four horizontal and vertical neighbors connect land. Diagonal cells belong to separate islands unless another path connects them.
