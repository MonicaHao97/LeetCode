class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode prev = newHead;
        for(int i = 0; i < left - 1; i ++){
            prev = prev.next;
        }
        ListNode start = prev.next;         
        ListNode after = start.next;

        for(int i = 0; i < right - left; i ++){
         start.next = after.next;
            after.next  = prev.next;
            prev.next = after;
            after = start.next;
        }
        return newHead.next;
    }
}