class Solution {
    public ListNode sortList(ListNode head) {        
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode temp1 = sortList(head);
        ListNode temp2 = sortList(slow);
        
        return merge(temp1, temp2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode p1 = l;
        
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                p1.next = l1;
                l1 = l1.next;
            }else{
                p1.next = l2;
                l2 = l2.next;
            }
           p1 = p1.next;
        }
        
        if(l1 != null){
            p1.next = l1;
        }
        
        if(l2 != null){
            p1.next = l2;
        }
        return l.next;
    }
}