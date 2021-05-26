class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode t3 = dummy;
        int sum = 0;
        
        while(t1 != null || t2 != null || sum != 0) {
            if(t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }
            
            if(t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            
            t3.next = new ListNode(sum % 10);
            sum /= 10;
            t3 = t3.next;
        }
        
        return dummy.next;
    }
}