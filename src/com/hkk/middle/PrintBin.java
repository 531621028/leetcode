package com.hkk.middle;

public class PrintBin {

    public String printBin(double num) {
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        while (num != 0) {
            double tmp = num * 2;
            if (tmp >= 1) {
                sb.append(1);
                num = tmp - 1;
            } else {
                sb.append(0);
                num = tmp;
            }
            if (sb.length() > 34) {
                return "ERROR";
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new PrintBin().printBin(0.625));
    }
}