package com.hkk.solution;

/**
 * @author kang
 * @date 2023/2/19
 */
public class Solution20230219 {

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] total = new int[400][2];
        int length = 0;
        int i1 = 0;
        int i2 = 0;
        while (i1 < nums1.length && i2 < nums2.length) {
            int[] num1 = nums1[i1];
            int[] num2 = nums2[i2];
            if (num1[0] < num2[0]) {
                total[length] = new int[]{
                    num1[0], num1[1]
                };
                i1++;
                length++;
            } else if (num1[0] > num2[0]) {
                total[length] = new int[]{
                    num2[0], num2[1]
                };
                i2++;
                length++;
            } else {
                total[length] = new int[]{
                    num1[0], num1[1] + num2[1]
                };
                i1++;
                i2++;
                length++;
            }
        }
        while (i1 < nums1.length) {
            int[] num1 = nums1[i1];
            total[length] = new int[]{
                num1[0], num1[1]
            };
            i1++;
            length++;
        }

        while (i2 < nums2.length) {
            int[] num2 = nums2[i2];
            total[length] = new int[]{
                num2[0], num2[1]
            };
            i2++;
            length++;
        }
        final int[][] result = new int[length][2];
        System.arraycopy(total, 0, result, 0, length);
        return result;
    }


    public static int minOperations(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n % 2 == 0) {
            int i = 1;
            int maxLittle = 0;
            int minLarge = 0;
            while (2 * i < n) {
                maxLittle = 2 * i;
                i = i * 2;
                minLarge = 2 * i;
                if (minLarge == n) {
                    return 1;
                }
            }
            return 1 + Math.min(minOperations(n - maxLittle), minOperations(minLarge - n));
        } else {
            int n1 = minOperations(n - 1);
            int n2 = minOperations(n + 1);
            return 1 + Math.min(n1, n2);
        }
    }

    public static void main(String[] args) {
        int[][] nums1 = new int[][]{
            new int[]{
                2, 4
            }, new int[]{
            3, 6
        }, new int[]{
            5, 5
        }
        };
        int[][] nums2 = new int[][]{
            new int[]{
                1, 3
            }, new int[]{
            4, 3
        }
        };
        final int[][] result = mergeArrays(nums1, nums2);
        System.out.println(result);
        System.out.println(minOperations(16));
    }
}
