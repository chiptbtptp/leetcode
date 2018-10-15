package com.leetcode;

/**
 * 计算平方根
 * @author chiptbtptp
 * @since 1.0
 */
public class T069SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }

    private static int mySqrt(int x) {
        int sqrt = 1;
        for (int i=1; i<= x/2+1;i++) {
            if (i * i < 0 || i * i > x) {
                return i - 1;
            }
        }
        return sqrt;
    }
}
