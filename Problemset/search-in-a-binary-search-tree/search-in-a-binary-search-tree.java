
// @Title: 二叉搜索树中的搜索 (Search in a Binary Search Tree)
// @Author: 17816069684
// @Date: 2020-09-06 09:06:14
// @Runtime: 0 ms
// @Memory: 39.6 MB

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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null||root.val==val){
            return root;
        }
        return val<root.val ?searchBST(root.left,val): searchBST(root.right,val);
    }
}
