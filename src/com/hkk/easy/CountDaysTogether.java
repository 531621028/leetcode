package com.hkk.easy;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/4/17
 */
public class CountDaysTogether {

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int arriveAliceIndex = index(monthDays, arriveAlice);
        int leaveAliceIndex = index(monthDays, leaveAlice);
        int arriveBobIndex = index(monthDays, arriveBob);
        int leaveBobIndex = index(monthDays, leaveBob);
        if (leaveAliceIndex < arriveBobIndex || leaveBobIndex < arriveAliceIndex) {
            return 0;
        } else {
            final int[] sortIndex = {arriveAliceIndex, arriveBobIndex, leaveBobIndex, leaveAliceIndex};
            Arrays.sort(sortIndex);
            return sortIndex[2] - sortIndex[1] + 1;
        }

    }

    private int index(int[] monthDays, String date) {
        int month;
        int day;
        final String[] split = date.split("-");
        if (split[0].startsWith("0")) {
            month = Integer.parseInt(split[0].substring(1, 2));
        } else {
            month = Integer.parseInt(split[0]);
        }
        if (split[1].startsWith("0")) {
            day = Integer.parseInt(split[1].substring(1, 2));
        } else {
            day = Integer.parseInt(split[1]);
        }
        int result = 0;
        for (int i = 1; i < month; i++) {
            result = result + monthDays[i - 1];
        }
        for (int i = 1; i <= day; i++) {
            result = result + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountDaysTogether().countDaysTogether("08-06", "12-08", "02-04", "09-01"));
    }
}
