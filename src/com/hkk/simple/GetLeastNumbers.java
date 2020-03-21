package com.hkk.simple;

import java.util.Arrays;

public class GetLeastNumbers {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length < k) {
            return arr;
        }
        if (k == 0) {
            return new int[0];
        }
        quickSort(arr, 0, arr.length - 1, k);
        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, k);
        return result;
    }

    public void quickSort(int[] arr, int start, int end, int k) {
        if (start < end) {
            int i = partition(arr, start, end);
            if (i == k - 1) {
                return;
            }
            quickSort(arr, start, i - 1, k);
            quickSort(arr, i + 1, end, k);
        }

    }

    public int partition(int[] nums, int start, int end) {
        int i = start;
        int j = start;
        while (j < end) {
            if (nums[j] < nums[end]) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        swap(nums, i, end);
        return i;
    }


    public void swap(int[] nums, int i, int j) {
        if (nums[i] != nums[j]) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] source = new int[]{0, 1, 2, 1};
        System.out.println(Arrays.toString(new GetLeastNumbers().getLeastNumbers(source, 1)));
    }

}
