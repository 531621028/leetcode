package com.hkk.simple;

/**
 * Created by kang on 2019/4/14.
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        long reverse = 0;
        while (y >= 10) {
            reverse = reverse * 10 + y % 10;
            y = y / 10;
        }
        return reverse == x;
    }
}
