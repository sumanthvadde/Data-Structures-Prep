class MinStack {
    
    class ListNode{
        int val;
        int min;
        ListNode next;
        
        ListNode(int val,int min,ListNode next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    ListNode head;

    public MinStack() {
        ListNode head = null;
    }
    
    public void push(int val) {
        if(head == null){
            head = new ListNode(val,val,null);
        }else{
            head = new ListNode(val,Math.min(val,head.min),head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}