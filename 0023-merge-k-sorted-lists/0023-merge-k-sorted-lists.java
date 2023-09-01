/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *}
*/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
          
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> (a.val-b.val));
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        for(int i=0;i<lists.length;i++) {
            if(lists[i] != null) {
                pq.add(lists[i]);                
            }
        }
        
        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            head.next = node;
            head = head.next;
            if(node.next != null) {
                pq.add(node.next);
            }
        }
        return dummy.next;
    }
}