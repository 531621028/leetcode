package com.hkk.middle;

/**
 * @author kang
 * @date 2023/4/6
 */
public class BaseNeg2 {

    public String baseNeg2(int n) {
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            res.insert(0, (n & 1));
            n = -(n >> 1);
        }
        return res.toString().equals("") ? "0" : res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new BaseNeg2().baseNeg2(3));
    }
}
