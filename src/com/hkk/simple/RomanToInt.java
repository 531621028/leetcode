package com.hkk.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kang on 2019/4/15.
 */
public class RomanToInt {
    private static Map<Character, Integer> map = new HashMap<>();
    private static List<Character> oneList = new ArrayList<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        oneList.add('I');
        oneList.add('X');
        oneList.add('C');
    }

    public int romanToInt(String s) {
        int result = 0;
        int index = 0;
        while (index < s.length()) {
            char num = s.charAt(index);
            if (index < s.length() - 1 && oneList.contains(num)) {
                char nextNum = s.charAt(index + 1);
                if (map.get(nextNum) > map.get(num)) {
                    result = result + map.get(nextNum) - map.get(num);
                    index += 2;
                    continue;
                }
            }
            result += map.get(s.charAt(index));
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        new RomanToInt().romanToInt("MCMXCIV");
    }
}
