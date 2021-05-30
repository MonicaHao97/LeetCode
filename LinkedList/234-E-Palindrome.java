class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode start = new ListNode(-1);
        start.next = head;
        return check(start, head);
    }
    
    public boolean check(ListNode start, ListNode end) {
        if(end == null) {
            return true;
        }
        
        boolean isEnd = check(start, end.next);
        boolean isPalin = (start.next.val == end.val) ? true : false;
        start.next = start.next.next;
        
        return isEnd && isPalin;
    }
}