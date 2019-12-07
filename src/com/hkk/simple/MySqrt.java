package com.hkk.simple;

/**
 * Created by kang on 2019/4/26.
 */
public class MySqrt {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int i = 0x5f3759df - (x >> 1);
        while (x / i < i) {
            i = (i + x / i) >> 1;
        }
        return i;
    }

    public static void main(String[] args) {
        new MySqrt().mySqrt(2147395599);
        System.out.println(65534 * 65534);
    }
}
