package com.hkk.middle;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/3/30
 */
public class MaxWidthOfVerticalArea {

    public int maxWidthOfVerticalArea(int[][] points) {
        quickSort(points, 0, points.length - 1);
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x = points[i][0];
            int minY = Integer.MAX_VALUE;
            int endY = Integer.MIN_VALUE;
            for (int j = i + 1; j < points.length; j++) {
                if (minY == Integer.MAX_VALUE) {
                    result = Math.max(result, points[j][0] - x);
                    minY = Math.min(points[i][1], points[j][1]);
                    endY = points[j][1];
                } else if (minY > points[j][1] && endY < points[j][1]) {
                    result = Math.max(result, points[j][0] - x);
                    minY = Math.min(minY, points[j][1]);
                    endY = points[j][1];
                } else {
                    break;
                }
            }

        }
        return result;
    }

    private void quickSort(int[][] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    private int partition(int[][] arr, int left, int right) {
        int pivot = arr[right][0];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j][0] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{
            {3, 1},
            {9, 0},
            {1, 0},
            {1, 4},
            {5, 3},
            {8, 8}
        };
        final MaxWidthOfVerticalArea maxWidthOfVerticalArea = new MaxWidthOfVerticalArea();
        maxWidthOfVerticalArea.quickSort(points, 0, points.length - 1);
        System.out.println(Arrays.asList(points));
        System.out.println(maxWidthOfVerticalArea.maxWidthOfVerticalArea(points));
    }
}
