class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = slow.next;
        slow.next = null;
        prev = reverseList(prev);
        
        head =  mergeList(head, prev);
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
    
    private ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        while(temp1 != null && temp2 != null) {
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;
            
            temp1.next = temp2;
            temp2.next = next1;
            
            temp1 = next1;
            temp2 = next2;
        }
    
        return l1;
    }
}