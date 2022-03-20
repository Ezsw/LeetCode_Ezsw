
// @Title: 二叉树的层序遍历 (Binary Tree Level Order Traversal)
// @Author: 17816069684
// @Date: 2020-08-29 16:50:36
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null)
            queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode temp=queue.poll();
                list.add(temp.val);
                if (temp.left!=null)
                    queue.add(temp.left);
                if (temp.right!=null)
                    queue.add(temp.right);
            }
        res.add(list);    
        }
    return res;    
    }
}
