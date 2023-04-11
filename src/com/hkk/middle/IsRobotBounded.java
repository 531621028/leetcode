package com.hkk.middle;

/**
 * @author kang
 * @date 2023/4/11
 */
public class IsRobotBounded {

    public boolean isRobotBounded(String instructions) {
        int[][] direc = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direcIndex = 0;
        int x = 0, y = 0;
        for (int index = 0; index < instructions.length(); index++) {
            char instruction = instructions.charAt(index);
            if (instruction == 'R') {
                direcIndex++;
                direcIndex %= 4;
            } else if (instruction == 'L') {
                direcIndex += 3;
                direcIndex %= 4;
            } else {
                x += direc[direcIndex][0];
                y += direc[direcIndex][1];
            }
        }
        return direcIndex != 0 || (x == 0 && y == 0);
    }
}
