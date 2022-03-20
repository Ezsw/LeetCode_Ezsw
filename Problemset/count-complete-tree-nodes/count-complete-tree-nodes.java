
// @Title: 完全二叉树的节点个数 (Count Complete Tree Nodes)
// @Author: 17816069684
// @Date: 2020-08-30 10:07:47
// @Runtime: 0 ms
// @Memory: 41.4 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
}
