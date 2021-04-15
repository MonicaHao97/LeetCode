class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode temp1 = before;
        ListNode temp2 = after;
        
        while(head != null) {
            if(head.val < x) {
                temp1.next = head;
                temp1 = temp1.next;
            }else{
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
        }
        
        temp2.next = null;
        temp1.next = after.next;
        return before.next;
    }
}