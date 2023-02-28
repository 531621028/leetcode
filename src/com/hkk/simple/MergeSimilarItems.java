package com.hkk.simple;


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
public class MergeSimilarItems {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[][] result = new int[1001][2];
        for (int[] item : items1) {
            renderItem(item, result[item[0]]);
        }
        for (int[] item : items2) {
            renderItem(item, result[item[0]]);
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (int[] item : result) {
            if (item[0] != 0) {
                List<Integer> retItem = new ArrayList<Integer>();
                retItem.add(item[0]);
                retItem.add(item[1]);
                ret.add(retItem);
            }
        }
        return ret;
    }

    private void renderItem(int[] item, int[] resultItem) {
        resultItem[0] = item[0];
        resultItem[1] = resultItem[1] + item[1];
    }

    public static void main(String[] args) {
        int[][] items1 = new int[][]{
            new int[]{1, 1
            }, new int[]{4, 5
        }, new int[]{3, 8
        }
        };

        int[][] items2 = new int[][]{
            new int[]{3, 1
            }, new int[]{1, 5
        }
        };
        System.out.println(new MergeSimilarItems().mergeSimilarItems(items1, items2));
    }
}
