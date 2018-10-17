package com.leetcode;

/**
 * 判断给定的二叉树是否是平衡二叉树
 *
 * @author chiptbtptp
 * @since 1.0
 */
public class T110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);

        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int treeDepth(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = treeDepth(node.left) + 1;
        int rightDepth = treeDepth(node.right) + 1;
        return Math.max(leftDepth, rightDepth);
    }
}
