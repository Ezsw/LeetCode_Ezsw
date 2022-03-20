
// @Title: 二叉树的后序遍历 (Binary Tree Postorder Traversal)
// @Author: 17816069684
// @Date: 2020-09-05 16:50:03
// @Runtime: 0 ms
// @Memory: 36.8 MB

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output=new LinkedList<Integer>();
        DFS(output,root);
        return output;
    }    
    public void DFS(List<Integer>output,TreeNode root){
        if(root!=null){
        DFS(output,root.left);
        DFS(output,root.right);
        output.add(root.val);
        }
    }
}
