package com.hkk.middle;

/**
 * @author kang
 * @date 2023/3/6
 */
public class MinimumDeletions {

    public int minimumDeletions(String s) {
        int aNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aNum++;
            }
        }

        int result = aNum;
        int leftB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aNum--;
            } else {
                leftB++;
            }
            result = Math.min(result, leftB + aNum);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumDeletions().minimumDeletions("baa"));
    }
}
