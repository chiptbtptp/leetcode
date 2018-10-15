package com.leetcode;

/**
 * 计算二叉树最大深度
 * @author
 * @since 1.0
 */
public class T104MaxDepthofBinaryTree {
    public static int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return depth;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        depth = Math.max(leftDepth, rightDepth) + 1;
        return depth;
    }
}
