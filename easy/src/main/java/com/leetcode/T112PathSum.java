package com.leetcode;

/**
 * 给定一个二叉树和一个值，判断是否有根节点到叶节点的路径上所有节点值之和等于给定的值
 *
 * @author
 * @since 1.0
 */
public class T112PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if ( root == null) return false;
        //用sum-root.val代替求和，这个思想很好
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
