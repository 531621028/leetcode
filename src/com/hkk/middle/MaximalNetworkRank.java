package com.hkk.middle;

/**
 * @author kang
 * @date 2023/3/15
 */
public class MaximalNetworkRank {

    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connect = new boolean[n][n];
        int[] degree = new int[n];
        for (int[] v : roads) {
            connect[v[0]][v[1]] = true;
            connect[v[1]][v[0]] = true;
            degree[v[0]]++;
            degree[v[1]]++;
        }

        int maxRank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = degree[i] + degree[j] - (connect[i][j] ? 1 : 0);
                maxRank = Math.max(maxRank, rank);
            }
        }
        return maxRank;
    }

    public static void main(String[] args) {

        int[][] roads = new int[][]{
            {4, 6},
            {5, 2},
            {3, 5},
            {7, 5},
            {7, 6}
        };
        System.out.println(new MaximalNetworkRank().maximalNetworkRank(8, roads));
        // int[][] roads = new int[][]{
        //     {0, 1},
        //     {0, 3},
        //     {1, 2},
        //     {1, 3},
        //     {2, 3}
        // };
        // System.out.println(new MaximalNetworkRank().maximalNetworkRank(5, roads));

        // int[][] roads = new int[][]{
        //     {0, 1},
        //     {1, 2},
        //     {2, 3},
        //     {2, 4},
        //     {5, 6},
        //     {5, 7}
        // };
        // System.out.println(new MaximalNetworkRank().maximalNetworkRank(8, roads));
    }
}
