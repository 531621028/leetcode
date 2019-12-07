package com.hkk.simple;

/**
 * Created by kang on 2019/4/16.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = 0;
        if (!isSame(strs, index++)) {
            return "";
        }
        while (isSame(strs, index)) {
            index++;
        }
        return strs[0].substring(0, index);

    }

    public boolean isSame(String[] strs, int index) {
        if (strs[0].length() <= index) {
            return false;
        }
        char s = strs[0].charAt(index);
        for (String str : strs) {
            if (str.length() <= index || s != str.charAt(index)) {
                return false;
            }
        }
        return true;
    }
}
