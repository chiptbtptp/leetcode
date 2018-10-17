package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 计算二叉树的最小深度
 * @author
 * @since 1.0
 */
public class T111MinimumDepthofBinaryTree {

    //我的解法,递归的逻辑没有简化，DFS
    public int minDepth(TreeNode root) {
        int minimunDepth =0;
        if (root == null) return 0;
        if (root.left==null && root.right==null) return 1;
        if (root.left == null) {
            minimunDepth = minDepth(root.right) + 1;
        }
        if (root.right == null) {
            minimunDepth = minDepth(root.left) + 1;
        }
        if (root.left != null && root.right != null) {
            minimunDepth = Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
        return minimunDepth;
    }

    //最简递归逻辑 DFS
    //这个最简单递归DFS有个缺点，如果根节点的左子树深度很深，但是右子树只有一个节点，那么递归次数非常多，
    //使用BFS是一个很好的办法，时间和空间效率都很高。
    public int minDepth2(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //如果左子树或右子树为空，那么高度为右子树或左子树+1， 否则去最小值+1
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    //迭代版本， BFS
    public int minDepth3(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> que = new LinkedList<>();
        int level =1;
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            while(size>0){
                TreeNode node =que.poll();
                if(node.left == null && node.right ==null)
                    return level;
                if(node.left != null)
                    que.add(node.left);
                if(node.right != null)
                    que.add(node.right);
                size--;
            }
            level++;
        }
        return level;
    }
}
