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


public class Solution{
    
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        
        final Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            final TreeNode node = queue.poll();
            final TreeNode left = node.left;
            
            final TreeNode right = node.right;
            
            node.left = right;
            
            node.right = left;
            
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right !=null){
                queue.offer(node.right);
            }
            
        }
        return root;
    }
}