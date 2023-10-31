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
    
    public List<Integer> inorderTraversal(TreeNode root){
       Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode curr = root;
        
        while(!stack.isEmpty() || curr != null){
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                result.add(curr.val);
                curr = curr.right;
            }
        }
        
        return result;
        
    }
}