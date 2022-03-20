
// @Title: 相同的树 (Same Tree)
// @Author: 17816069684
// @Date: 2020-08-29 08:48:58
// @Runtime: 0 ms
// @Memory: 36.3 MB

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if (p==null||q==null) return false;
        else if(p.val!=q.val){
            return false;
        }
        else {
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
    }
}
