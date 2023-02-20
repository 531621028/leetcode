package com.hkk.solution;

/**
 * @author kang
 * @date 2023/2/19
 */
public class Solution20230220 {

    public String bestHand(int[] ranks, char[] suits) {
        if (isFlush(suits)) {
            return "Flush";
        }
        int[] record = new int[13];
        for (int r : ranks) {
            record[r - 1] = record[r - 1] + 1;
        }
        int max = 0;
        for (int r : record) {
            if (r > max) {
                max = r;
            }
        }
        if (max == 3) {
            return "Three of a Kind";
        } else if (max == 2) {
            return "Pair";
        }
        return "High Card";

    }

    private boolean isFlush(char[] suits) {
        return suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4];
    }

    public static void main(String[] args) {
        System.out.println(new Solution20230220().bestHand(new int[]{
            1, 1, 2, 4, 5
        }, new char[]{
            'a', 'a', 'a', 'a', 'b'
        }));
    }
}
