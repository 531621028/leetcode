package com.hkk.simple;

/**
 * Created by kang on 2019/4/23.
 */
public class CountAndSay {

    public String countAndSay(int n) {
        String[] tmpStr = new String[30];
        tmpStr[0] = "1";
        for (int i = 1; i < n; i++) {
            tmpStr[i] = getNext(tmpStr[i - 1]);
        }
        return tmpStr[n - 1];
    }


    public String getNext(String cur) {
        StringBuilder sb = new StringBuilder();
        char c = cur.charAt(0);
        int count = 1;
        for (int i = 1; i < cur.length(); i++) {
            if (cur.charAt(i) == c) {
                count++;
            } else {
                sb.append(count).append(c);
                c = cur.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(c);
        return sb.toString();
    }

}
