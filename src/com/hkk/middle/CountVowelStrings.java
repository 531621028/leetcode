package com.hkk.middle;

/**
 * @author kang
 * @date 2023/3/29
 */
public class CountVowelStrings {

    public int countVowelStrings(int n) {
        return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
    }

    public static void main(String[] args) {
        System.out.println(new CountVowelStrings().countVowelStrings(2));
    }
}
