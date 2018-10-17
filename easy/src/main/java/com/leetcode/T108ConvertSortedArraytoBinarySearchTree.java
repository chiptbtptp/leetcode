package com.leetcode;

/**
 * 将有序数组转换成平衡二叉树
 *
 * @author
 * @since 1.0
 */
public class T108ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int length = nums.length;
        return createBST(nums, 0, length-1);
    }

    public TreeNode createBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBST(nums, left, mid - 1);
        node.right = createBST(nums, mid + 1, right);
        return node;
    }
}
