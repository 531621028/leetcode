package com.hkk.simple;


//leetcode submit region begin(Prohibit modification and deletion)
class MinimumOperations {

    public int minimumOperations(int[] nums) {
        int cycles = 0;
        while (!isAllZero(nums)) {
            int minNumber = minNumber(nums);
            subtraction(nums, minNumber);
            cycles++;
        }
        return cycles;
    }

    private int minNumber(int[] nums) {
        int minNumber = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > 0 && minNumber > num) {
                minNumber = num;
            }
        }
        return minNumber;
    }

    private void subtraction(int[] nums, int minNumber) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] = nums[i] - minNumber;
            }
        }
    }

    private boolean isAllZero(int[] nums) {
        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{
            1, 5, 0, 3, 5
        };
        new MinimumOperations().minimumOperations(nums);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
