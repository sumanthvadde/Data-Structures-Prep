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

    public TreeNode lowestCommonAncestor(
        TreeNode root,
        TreeNode p,
        TreeNode q
    ) {
     if (root == null || root == p || root == q) {
            return root;
        }
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        while (root != null) {
            if (max < root.val) {
                root = root.left;
            } else if (min > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}