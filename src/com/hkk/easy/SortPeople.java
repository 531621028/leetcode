package com.hkk.easy;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/4/25
 */
public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        String[] sortedNames = new String[100001];
        for (int i = 0; i < names.length; i++) {
            sortedNames[heights[i]] = names[i];
        }
        String[] result = new String[names.length];
        int index = 0;
        for (int i = sortedNames.length - 1; i >= 0; i--) {
            if (sortedNames[i] != null) {
                result[index++] = sortedNames[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        System.out.println(Arrays.toString(new SortPeople().sortPeople(names, heights)));
    }
}
