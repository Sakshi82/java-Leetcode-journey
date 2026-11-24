import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;
        int[] rowDirections = {-1, 1, 0, 0};
        int[] colDirections = {0, 0, -1, 1};

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    Deque<int[]> stack = new ArrayDeque<>();
                    stack.push(new int[]{row, col});
                    grid[row][col] = '0';

                    while (!stack.isEmpty()) {
                        int[] cell = stack.pop();

                        for (int direction = 0; direction < 4; direction++) {
                            int nextRow = cell[0] + rowDirections[direction];
                            int nextCol = cell[1] + colDirections[direction];

                            if (nextRow >= 0 && nextRow < rows
                                    && nextCol >= 0 && nextCol < cols
                                    && grid[nextRow][nextCol] == '1') {
                                grid[nextRow][nextCol] = '0';
                                stack.push(new int[]{nextRow, nextCol});
                            }
                        }
                    }
                }
            }
        }

        return islands;
    }
}
