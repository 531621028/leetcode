package com.hkk.simple;

/**
 * Created by kang on 2019/4/24.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[] tmp = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry == 10) {
                carry = 1;
                tmp[i] = 0;
            } else {
                tmp[i] = digits[i] + carry;
                carry = 0;
            }
        }
        int[] result;
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = tmp[i - 1];
            }
        } else {
            result = tmp;
        }
        return result;
    }
}
