package com.leetcode;

/**
 * 求二叉搜索树中两个元素的最小公共祖先
 *  一个节点可以是自己的后代
 *  假定所有值都是不同的， 而且给定的两个值都在二叉搜索树中
 * @author
 * @since 1.0
 */
public class T235LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        while ((root.val - p.val) * (root.val - q.val) > 0) { //p和q在节点的同一侧。（用减法做乘这个想法简直牛逼）
            root = p.val < root.val ? root.left : root.right;
        }
        return root;
    }
}
