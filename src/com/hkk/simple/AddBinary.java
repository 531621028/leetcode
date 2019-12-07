package com.hkk.simple;

/**
 * Created by kang on 2019/4/25.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int[] res;
        int carry;
        if (a.length() < b.length()) {
            res = new int[b.length()];
            carry = plus(res, a.length(), a, b);
            return concatLeave(res, carry, a.length() + 1, b);
        } else {
            res = new int[a.length()];
            carry = plus(res, b.length(), a, b);
            return concatLeave(res, carry, b.length() + 1, a);
        }
    }

    private int plus(int[] res, int min, String a, String b) {
        int carry = 0;
        for (int i = 1; i <= min; i++) {
            int count = a.charAt(a.length() - i) + b.charAt(b.length() - i) - 2 * '0' + carry;
            carry = count / 2;
            res[res.length - i] = count % 2;
        }
        return carry;
    }

    private String concatLeave(int[] res, int carry, int index, String leave) {
        StringBuilder sb = new StringBuilder();
        if (carry == 0) {
            sb.append(leave.substring(0, leave.length() - index + 1));
            for (int i = leave.length() - index + 1; i < res.length; i++) {
                sb.append(res[i]);
            }
        } else {
            for (int i = index; i <= leave.length(); i++) {
                int count = leave.charAt(leave.length() - i) - '0' + carry;
                carry = count / 2;
                res[res.length - i] = count % 2;
            }
            if (carry == 1) {
                sb.append(1);
            }
            for (int i = 0; i < res.length; i++) {
                sb.append(res[i]);
            }
        }
        return sb.toString();
    }
}
