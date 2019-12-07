package com.hkk.simple;

/**
 * Created by kang on 2019/4/12.
 */
public class Reverse {
    public int reverse(int x) {
        int reverse = 0;
        while (x >= 10 || x <= -10) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        if (x < 0) {
            if (reverse < (Integer.MIN_VALUE - x) / 10) {
                return 0;
            }
            return -reverse * 10 - x;
        } else {
            if ((Integer.MAX_VALUE - x) / 10 < reverse) {
                return 0;
            }
            return reverse * 10 + x;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse(1463847412));
        System.out.println(Integer.MAX_VALUE);
    }
}
