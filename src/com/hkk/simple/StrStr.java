package com.hkk.simple;

/**
 * Created by kang on 2019/4/19.
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && i + needle.length() <= haystack.length()) {
                int j = 1;
                for (; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
