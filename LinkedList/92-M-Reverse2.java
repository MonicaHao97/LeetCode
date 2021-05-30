class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) {
            return head;
        }
        
        ListNode start = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for(int i = 0; i < left - 1; i ++) {
            start = start.next;
            prev = prev.next;
        }
        
        //prev and start does not change
        //only after - the node to be reversed will change
        //pick t, delete it and insert it to the next of prev
        //so that the sublist will always be in descending order
        ListNode after = start.next;
        for(int i = 0; i < right-left; i ++) {
            //skip after
            start.next = after.next;
            //move after to front of sublist
            after.next = prev.next;
            //connect after and prev;
            prev.next = after;
            //move after forward;
            after = start.next;
        }
        
        return dummy.next;
    }
}