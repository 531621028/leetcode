package com.hkk.middle;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/3/14
 */
public class RestoreMatrix {

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] result = new int[rowSum.length][colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            if (rowSum[i] == 0) {
                continue;
            }
            for (int j = 0; j < colSum.length; j++) {
                if (colSum[j] == 0) {
                    continue;
                }
                result[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] = rowSum[i] - result[i][j];
                colSum[j] = colSum[j] - result[i][j];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] rowSum = new int[]{5, 7, 10};
        int[] colSum = new int[]{8, 6, 8};
        System.out.println(Arrays.toString(new RestoreMatrix().restoreMatrix(rowSum, colSum)));
    }
}
