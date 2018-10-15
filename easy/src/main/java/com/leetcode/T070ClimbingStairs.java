package com.leetcode;

/**
 * 爬楼梯问题
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * 
 * @author chiptbtptp
 * @since 1.0
 */
public class T070ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }

    private static int climbStairs(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 2;
        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
        }

        return result[n-1];
    }

}
