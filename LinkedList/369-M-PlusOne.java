class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode lastNotNine = dummy;
        ListNode temp = dummy;
        
        while(temp.next != null) {
            temp = temp.next;
            if(temp.val != 9) {
                lastNotNine = temp;
            }
        }
        
        if(temp.val != 9) {
            temp.val += 1;
        }else{
            lastNotNine.val += 1;
            while(lastNotNine.next != null) {
                lastNotNine = lastNotNine.next;
                lastNotNine.val = 0;
            }
        }
        
        if(dummy.val == 0) {
            return dummy.next;
        }
        
        return dummy;
    }
}