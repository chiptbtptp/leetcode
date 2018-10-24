package com.leetcode;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * Example 1:
 *  Input: [3,0,1]
 *  Output: 2
 *
 * @author
 * @since 1.0
 */

/**
 * 第一思路是将数组排序，然后遍历，数与index不同的即为缺失的值，这个方法虽然简单，但是时间复杂度高，取决于排序算法的时间复杂度
 *
 * discuss中给了一个好的方法，将每个数与index做异或，最后异或的结果就是缺失的那个数。
 * 异或思路很好
 */
public class T268MissingNumber {

    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res^nums.length;
    }
}
