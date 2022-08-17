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
    public boolean checkTree(TreeNode node) {
        int left_data = 0, right_data = 0;
  
        /* If node is NULL or it's a leaf node then
        return true */
        if (node == null
                || (node.left == null && node.right == null))
            return true;
        else
        {
             
            /* If left child is not present then 0 is used
               as data of left child */
            if (node.left != null)
                left_data = node.left.val;
  
            /* If right child is not present then 0 is used
               as data of right child */
            if (node.right != null)
                right_data = node.right.val;
  
            /* if the node and both of its children satisfy the
               property return 1 else 0*/
            if ((node.val == left_data + right_data)
                    && (checkTree(node.left))
                    && checkTree(node.right))
                return true;
            else
                return false;
        }
        
    }
}