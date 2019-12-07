package com.hkk.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kang on 2019/5/8.
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rowOne = Arrays.asList(1);
        result.add(rowOne);
        if (numRows == 1) {
            return result;
        }
        List<Integer> rowTwo = Arrays.asList(1, 1);
        result.add(rowTwo);
        if (numRows == 2) {
            return result;
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> lastRow = result.get(i - 2);
            for (int j = 2; j < i; j++) {
                row.add(lastRow.get(j - 2) + lastRow.get(j - 1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
