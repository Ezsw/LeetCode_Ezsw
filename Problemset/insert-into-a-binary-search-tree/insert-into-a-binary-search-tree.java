
// @Title: 二叉搜索树中的插入操作 (Insert into a Binary Search Tree)
// @Author: 17816069684
// @Date: 2020-09-06 11:20:37
// @Runtime: 0 ms
// @Memory: 39.4 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        if(val>root.val)
            root.right=insertIntoBST(root.right,val);
        else root.left=insertIntoBST(root.left,val);
        return root;
    }

}
