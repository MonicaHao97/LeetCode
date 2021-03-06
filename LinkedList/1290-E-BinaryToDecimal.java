class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        
        while(head != null) {
            sum <<= 1;
            sum += head.val;
            head = head.next;
        }
        
        return sum;
    }
}