package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * @author
 * @since 1.0
 */
public class T169MajorElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorElement(nums));
    }

    public static int majorElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int major = 0;
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if (map.get(nums[i] )> nums.length / 2) {
                major = nums[i];
            }
        }
        return major;
    }
}
