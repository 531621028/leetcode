package com.hkk.easy;

/**
 * @author kang
 * @date 2023/4/21
 */
public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (result == n) {
                return result;
            }
            result = result + 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SmallestEvenMultiple().smallestEvenMultiple(7));
    }
}
