/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null | k == 0 || head.next == null ) return head;
        ListNode current = head;
        int count = 1;
        
        while(current.next!=null){
            count++;
            current = current.next;
        }
        
        k = k%count;
        k = count - k;
        
        current.next = head;
        
        while(k -- > 0){
            current = current.next;
        }
        
        head = current.next;
        current.next = null;
        
        return head;
        
    }
}