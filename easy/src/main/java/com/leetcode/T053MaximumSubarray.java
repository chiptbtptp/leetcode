package com.leetcode;

/**
 * 最大子序列和，很经典的题目
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 * Example：
 *  Input: [-2,1,-3,4,-1,2,1,-5,4],
 *  Output: 6
 *  Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *  If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 *  which is more subtle
 * @author w
 * @since 1.0
 */
public class T053MaximumSubarray {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubarray1(A);
        System.out.println(max);

    }

    //分治
    private int maxSubArray(int[] nums, int l, int r) {
        if (l > r) {
            return 0;
        }
        if (l == r) {
            return nums[l];
        }
        int m = (l + r) / 2;

        //横跨左右的最大连续子序列左半部分
        int lmax = nums[m];
        int lsum = 0;
        for (int i = m; i >= l; i--) {
            lsum += nums[i];
            if (lsum > lmax) {
                lmax = lsum;
            }
        }
        //横跨左右的最大连续子序列的右半部份
        int rmax = nums[r + 1];
        int rsum = 0;
        for(int i=m+1; i<=r; i++) {
            rsum += nums[i];
            if (rsum > rmax) {
                rmax = rsum;
            }
        }
        return max3(lmax + rmax, maxSubArray(nums, l, m), maxSubArray(nums, m + 1, r));
    }

    private int max3(int i, int j, int k) {
        int result1 = i > j ? i : j;
        return result1 > k ? result1 : k;
    }

    //动态规划
    //自底向下解法
    private static int maxSubarray1(int[] A){
        int n = A.length;
        int[] dp = new int[n];
        dp[0]=A[0];
        int max = dp[0];
        for (int i=1;i<n;i++) {
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

}
