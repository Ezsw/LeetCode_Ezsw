
// @Title: 路径总和 (Path Sum)
// @Author: 17816069684
// @Date: 2020-08-31 10:18:53
// @Runtime: 2 ms
// @Memory: 38.9 MB

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
    public boolean hasPathSum(TreeNode root, int sum) {
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<Integer> total=new LinkedList<>();
        int tempSum;
        if(root!=null){
            queue.add(root);
            total.add(root.val);
        }
        else{
            return false;
        }    
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            tempSum=total.poll();
            if(temp.left!=null){
                queue.add(temp.left);
                total.add(tempSum+temp.left.val);
            }
            if(temp.right!=null){
                queue.add(temp.right);
                total.add(tempSum+temp.right.val);
            }
            else if(temp.left==null&&tempSum==sum){
                return true;
            }            
        }
    return false;
    }
}
