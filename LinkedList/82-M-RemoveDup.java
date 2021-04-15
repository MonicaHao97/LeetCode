class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        
        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;
        ListNode temp = head;
        prev.next = temp;
        
        while(temp != null) {
            while(temp.next != null && temp.val == temp.next.val) {
                temp = temp.next;
            }
            if(prev.next != temp) {
                prev.next = temp.next;
                temp = prev.next;
            }
            else{
                prev = prev.next;
                temp = temp.next;
            }
        }
        return newHead.next;
    }
}