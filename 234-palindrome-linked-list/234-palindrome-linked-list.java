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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast.next!= null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow.next = reverseLL(slow.next);
        slow = slow.next;
        while(slow != null){
            if(head.val!= slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        
        return true;
    }
    
    public ListNode reverseLL(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}