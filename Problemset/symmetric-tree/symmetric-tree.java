
// @Title: 对称二叉树 (Symmetric Tree)
// @Author: 17816069684
// @Date: 2020-08-29 10:25:38
// @Runtime: 0 ms
// @Memory: 37.4 MB

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
    public boolean isSymmetric(TreeNode root) {
        return realFunction(root,root);
    }
    public boolean realFunction(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        else if(p==null||q==null){
            return false;
        }
        else if(p.val!=q.val)
            return false;
        else{
            return realFunction(p.left,q.right)&&realFunction(p.right,q.left);
        }
    }
}
