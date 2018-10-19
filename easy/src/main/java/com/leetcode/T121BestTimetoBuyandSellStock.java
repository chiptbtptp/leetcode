package com.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.Note that you cannot sell a stock before you buy one.
 *
 * @author
 * @since 1.0
 */
public class T121BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {2,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int[] profits = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            profits[i] = prices[i + 1] - prices[i];
        }

        return maxPositiveSubArray(profits);
    }

    public static int maxPositiveSubArray(int[] array) {
        int max=array[0];
        int[] sum = new int[array.length];
        sum[0] = array[0];
        for(int i=1;i<array.length;i++) {
            sum[i] = array[i] + (sum[i - 1] > 0 ? sum[i - 1]  : 0);
            max = Math.max(sum[i], max);
        }

        return max > 0 ? max : 0;
    }
}
