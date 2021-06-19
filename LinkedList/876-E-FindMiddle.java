class Solution {
    public ListNode middleNode(ListNode head) {
        //Two pointer: slow and fast
        ListNode fast = head;
        ListNode slow = head;
        
        //fast == null then fast.next == null
        //handle even && odd cases for slow node
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}