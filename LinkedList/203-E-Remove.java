class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode prev = newHead;
        while(temp != null){
            if(temp.val == val) {
                prev.next = temp.next;
            }else{prev = temp;}
            temp = temp.next;
        }
        return newHead.next;
    }
}