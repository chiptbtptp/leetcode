package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断数组中重复的元素的索引之差是否不大于k
 *
 * discuss的解法中用了类似滑动窗口的一个set，idea很巧妙
 *
 * @author
 * @since 1.0
 */
public class T219ContainsDuplicate2 {
    public boolean containsNearByDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i< nums.length;i++) {
            //set中始终保持容量为k，如果超过，则移除第一个（保证index之差不超过k），然后添加一个，
            if (i >k) set.remove(nums[i - k - 1]);
            //如果添加不成功，说明set中已有，则返回true
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
