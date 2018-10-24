package com.leetcode;

/**
 * 将给定的数字的每一位相加，直到和只有一位
 * @author
 * @since 1.0
 */
public class T258AddDigits {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }

    public static int addDigits(int n) {
        while (n / 10 != 0) {
            n = digitSum(n);
        }
        return n;
    }

    private static int digitSum(int n) {
        int add = 0;
        while (n / 10 != 0) {
            add += n % 10;
            n /= 10;
        }
        return add + n;
    }
}
