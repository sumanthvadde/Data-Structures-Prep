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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> list = new ArrayList();
        if(root==null)
            return list;
        int count = 0; 
       
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> l = new ArrayList();
        boolean reverse = false;
        queue.add(root);
        while(queue.size()>0)
        {
            count = queue.size();
            l = new ArrayList();
            while(count>0)
            {
                TreeNode node = queue.remove();  
                l.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                count--;
            }
             if(reverse)
             {
            Collections.reverse(l);
            reverse= false;
             }
            else
            reverse= true;  
            list.add(l);
        }
        return list;
    }
}