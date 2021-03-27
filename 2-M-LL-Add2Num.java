class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sum = new ListNode(0);
        ListNode result = sum;
        int temp = 0;
        while(c1 != null || c2 != null){
            temp /= 10;
            if(c1 != null){
                temp += c1.val;
                c1 = c1.next;
            }
            if(c2 != null){
                temp += c2.val;
                c2 = c2.next;
            }
            sum.next = new ListNode(temp % 10);
            sum = sum.next;
        }
        
        if(temp >= 10){
            sum.next = new ListNode(1);
        }
        
        return result.next;
    }
}