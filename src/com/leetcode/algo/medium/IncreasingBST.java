package com.leetcode.algo.medium;

public class IncreasingBST {

    public TreeNode increasingBST(TreeNode root) {

        TreeNode newRoot = null;

        TreeNode currNode = null;

        createTree(root, newRoot, currNode);

        return newRoot;

    }

    private void createTree(TreeNode root, TreeNode newRoot, TreeNode currNode) {

        if(root == null) return;

        createTree(root.left, newRoot, currNode);

        if(newRoot == null){
            newRoot = new TreeNode(root.val);
            currNode = newRoot;
        }else{
            currNode.right = new TreeNode(root.val);
            currNode = currNode.right;
        }

        createTree(root.right, newRoot, currNode);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

