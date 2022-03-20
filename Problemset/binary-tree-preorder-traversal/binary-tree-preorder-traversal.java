
// @Title: 二叉树的前序遍历 (Binary Tree Preorder Traversal)
// @Author: 17816069684
// @Date: 2020-09-05 16:42:50
// @Runtime: 0 ms
// @Memory: 37.2 MB

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output=new LinkedList<Integer>();
        DFS(output,root);
        return output;
    }    
    public void DFS(List<Integer>output,TreeNode root){
        if(root!=null){
        output.add(root.val);
        DFS(output,root.left);
        DFS(output,root.right);
        }
    }
}
