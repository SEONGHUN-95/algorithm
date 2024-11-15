package org.solutions.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    class Solution {
        public int orangesRotting(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            Queue<int[]> rottenOranges = new LinkedList<>();
            int freshOranges = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 2) {
                        rottenOranges.add(new int[]{i, j});
                    } else if (grid[i][j] == 1) {
                        freshOranges++;
                    }
                }
            }

            if (freshOranges == 0) {
                return 0;
            }

            int minute = 0;
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            while (!rottenOranges.isEmpty()) {
                // 썩렌지 위치 까서 주변 오렌지 있으면 썩히기
                int size = rottenOranges.size();
                boolean newRotten = false;

                for (int i = 0; i < size; i++) {
                    int[] point = rottenOranges.poll();
                    int x = point[0];
                    int y = point[1];
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        // 조건을 충족하면 썩는다.
                        if (nx < rows && nx >= 0 && ny < cols && ny >= 0 && grid[nx][ny] == 1) {
                            grid[nx][ny] = 2;
                            rottenOranges.add(new int[]{nx, ny});
                            freshOranges--;
                            newRotten = true;
                        }
                    }
                }
                if (newRotten) minute++;
            }

            return freshOranges == 0 ? minute : -1;
        }
    }
}
