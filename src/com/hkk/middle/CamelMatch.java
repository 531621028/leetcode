package com.hkk.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kang
 * @date 2023/4/14
 */
public class CamelMatch {

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for (String query : queries) {
            result.add(isCamelMatch(query, pattern));
        }
        return result;
    }

    private Boolean isCamelMatch(String query, String pattern) {
        int p = 0;
        for (int q = 0; q < query.length(); q++) {
            if (p < pattern.length() && query.charAt(q) == pattern.charAt(p)) {
                p++;
            } else if (query.charAt(q) < 'a') {
                return Boolean.FALSE;
            }
        }
        if (p != pattern.length()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;

    }

    public static void main(String[] args) {
        // [true,false,true,true,false] FB
        String[] queries = new String[]{
            "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"
        };
        System.out.println(new CamelMatch().camelMatch(queries, "FB"));
    }
}
