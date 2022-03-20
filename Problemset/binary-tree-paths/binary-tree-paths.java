
// @Title: 二叉树的所有路径 (Binary Tree Paths)
// @Author: 17816069684
// @Date: 2020-09-04 15:57:57
// @Runtime: 8 ms
// @Memory: 39.2 MB

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> combinations=new LinkedList<String>();
        if(root!=null){
            Dfs(root,combinations,"");
        }
        return combinations;
    }
    public void Dfs(TreeNode root,List<String> combinations,String combination){
        StringBuffer connection=new StringBuffer(combination);
        if(root.left==null&&root.right==null){
            connection.append(root.val);
            combinations.add(connection.toString());
        }
        else{
            connection.append(root.val+"->");
            if(root.left!=null){
                Dfs(root.left,combinations,connection.toString());
            }
            if(root.right!=null){
                Dfs(root.right,combinations,connection.toString());
            }
        }
    }
}
