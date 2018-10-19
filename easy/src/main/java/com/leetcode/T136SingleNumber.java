package com.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * @author
 * @since 1.0
 */
public class T136SingleNumber {

    //使用异或，相同的值异或为0，最后剩下的是单独的
    //amazing trick
    public int singleNumber2(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        return sum;
    }

    public int singleNumber(int[] nums) {
        if (nums.length==0) return 0;
        int value=0;
        Map<Integer, Integer> map = new HashMap<>(nums.length / 2 + 1);
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            if ((int)entry.getValue() == 1) {
                value = (int)entry.getKey();
            }
        }
        return value;
    }


}
