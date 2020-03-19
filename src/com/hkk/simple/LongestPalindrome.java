package com.hkk.simple;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        if (s == null) {
            return 0;
        }
        int size = 0;
        int[] count = new int[60];
        for (char c : s.toCharArray()) {
            int index = c - 64;
            count[index] = count[index] + 1;
        }
        boolean hasOdd = false;
        for (int i = 0; i < 60; i++) {
            if (count[i] > 0) {
                if ((count[i] & 1) == 0) {
                    size = size + count[i];
                } else {
                    size = size + count[i] - 1;
                    hasOdd = true;
                }
            }
        }
        return hasOdd ? size + 1 : size;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
