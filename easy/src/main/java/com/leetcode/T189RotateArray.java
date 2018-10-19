package com.leetcode;

/**
 * 将给定数组右移k位，k非0
 *
 * @author
 * @since 1.0
 */
public class T189RotateArray {

    //法一：空间复杂度O（1）
    public static void rorate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0,k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    //法二：按步骤右移k位
    //法三：重新建一个数组，将其拷贝过来， newNums[(i+3)%num.length]=nums[i]
}
