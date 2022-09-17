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
public int maxPathSum(TreeNode root) {
int[] max = new int[1];
max[0] = Integer.MIN_VALUE;
getSum(root, max);
return max[0];
}

private int getSum(TreeNode root, int[] max) {
    if (root == null)
        return 0;
    int left = getSum(root.left, max);
    if (left < 0)
        left = 0;
    int right = getSum(root.right, max);
    if (right < 0)
        right = 0;
    int sum = left + right + root.val;
    if (sum > max[0])
        max[0] = sum;
    return Math.max(left + root.val, right + root.val);
}
}