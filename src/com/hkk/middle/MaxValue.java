package com.hkk.middle;

/**
 * @author kang
 * @date 2023/3/8
 */
public class MaxValue {

    public int maxValue(int[][] grid) {
        int[][] dy = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    dy[i][j] = grid[i][j];
                } else if (i == 0) {
                    dy[i][j] = grid[i][j] + dy[i][j - 1];
                } else if (j == 0) {
                    dy[i][j] = grid[i][j] + dy[i - 1][j];
                } else {
                    dy[i][j] = grid[i][j] + Math.max(dy[i - 1][j], dy[i][j - 1]);
                }
            }
        }
        return dy[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            new int[]{
                1, 3, 1
            },
            new int[]{
                1, 5, 1
            },
            new int[]{
                4, 2, 1
            }
        };
        System.out.println(new MaxValue().maxValue(grid));
    }
}
