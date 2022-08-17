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
    private TreeNode result;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root, p, q);
        return result;
    }
    
    public void traverse(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return;
        if (containNode(root, p) && containNode(root,q)) {
            result = root;
        }
        
        traverse(root.left, p, q);
        traverse(root.right, p, q);
    }
    
    public static boolean containNode(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root.val == p.val) return true;
        return containNode(root.left, p) || containNode(root.right, p);
    }
}