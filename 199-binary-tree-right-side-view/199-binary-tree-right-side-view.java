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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        if(root == null){
            return result;
        }
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size -- > 0){
                TreeNode temp = q.poll();
                if(size == 0){
                    result.add(temp.val);   
                }
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
        return result;
    }
}