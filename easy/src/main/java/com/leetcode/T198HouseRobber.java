package com.leetcode;

/**
 * 入室抢劫， 数组表示每个房子的钱，不能连续抢劫两个房子，求可以抢劫的最大钱数
 *
 * @author
 * @since 1.0
 */
public class T198HouseRobber {


    public static void main(String[] args) {
        int[] nums = {1,3,1,3,100};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        int max = Math.max(nums[0], nums[1]);
        int prepreSum = nums[0];
        int preSum = Math.max(prepreSum, nums[1]);
        for (int i=2;i<nums.length;i++) {
            int newSum = prepreSum + nums[i];
            int mx = Math.max(preSum, newSum);
            prepreSum = max;
            preSum = newSum;
            max = Math.max(max, mx);
        }
        return max;
    }

   public static int rob1(int num[], int n) {
        int a = 0;
        int b = 0;

        for (int i=0; i<n; i++)
        {
            if (i%2==0)
            {
                a = max(a+num[i], b);
            }
            else
            {
                b = max(a, b+num[i]);
            }
        }

        return max(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}
