package com.hkk.simple;

/**
 * Created by kang on 2019/4/24.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int tmp = 0, length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (tmp != 0) {
                    length = tmp;
                }
                tmp = 0;
            } else {
                tmp++;
            }
        }
        return length;
    }
}
