package com.leetcode;

/**
 * Remove duplicates from sorted array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Given nums = [1,1,2],Your function should return length = 2, with the first two elements of nums being 1 and 2
 * respectively.It doesn't matter what you leave beyond the returned length.
 *
 * @author wangkun@cetiti.com
 * @since 1.0
 */
public class T026RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length<2) return nums.length;
        int index = 1;
        for (int i=0; i< nums.length-1;i++) {
            if (nums[i + 1] > nums[i]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
