package com.hkk.middle;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/4/3
 */
public class PrevPermOpt1 {

    public int[] prevPermOpt1(int[] arr) {
        int[] minIndex = new int[arr.length];
        minIndex[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            minIndex[i] = Math.min(arr[i], minIndex[i + 1]);
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > minIndex[i]) {
                int maxValue = 0;
                int maxValueIndex = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > maxValue && arr[j] < arr[i]) {
                        maxValue = arr[j];
                        maxValueIndex = j;
                    }
                }
                swap(arr, i, maxValueIndex);
                return arr;
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PrevPermOpt1().prevPermOpt1(new int[]{
            3, 1, 1, 3
        })));
        System.out.println(Arrays.toString(new PrevPermOpt1().prevPermOpt1(new int[]{
            3, 2, 1
        })));
        System.out.println(Arrays.toString(new PrevPermOpt1().prevPermOpt1(new int[]{
            1, 1, 5
        })));
        System.out.println(Arrays.toString(new PrevPermOpt1().prevPermOpt1(new int[]{
            1, 9, 4, 6, 7
        })));
    }
}
