package com.hkk.easy;

/**
 * @author kang
 * @date 2023/3/9
 */
public class MinimumRecolors {

    public int minimumRecolors(String blocks, int k) {
        int whiteCnt = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCnt++;
            }
        }
        int result = whiteCnt;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'B' && blocks.charAt(i - k) == 'W') {
                whiteCnt--;
            } else if (blocks.charAt(i) == 'W' && blocks.charAt(i - k) == 'B') {
                whiteCnt++;
            }
            result = Math.min(whiteCnt, result);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new MinimumRecolors().minimumRecolors("WBBWWBBWBW", 7));
    }
}
