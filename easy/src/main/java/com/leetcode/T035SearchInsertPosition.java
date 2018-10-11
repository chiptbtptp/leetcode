package com.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index
 * where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 *
 * @author
 * @since 1.0
 */
public class T035SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int index=0;
        if (target < nums[0]) return 0;
        if (target> nums[nums.length-1]) return nums.length;
        for(int i=0;i<nums.length;i++) {
            int val = nums[i];
            if (val >= target) {
                return i;
            }
        }
        return index;
    }

    //二分搜索，有想到这个思路吗，但是以为没办法实现
    public int searchInsert2(int[] nums, int target) {
        int length = nums.length - 1;

        // add to end
        if (target > nums[length])
            return length + 1;

        // add to head
        if (target < nums[0])
            return 0;
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
