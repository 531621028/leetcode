package com.hkk.simple;

public class CanMeasureWater {

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || x + y == z;
        }
        return z % gcd(x, y) == 0;


    }

    private static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (a == b || a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a < b) {
            return gcd(a, b % a);
        } else {
            return gcd(b, a % b);
        }
    }

}
