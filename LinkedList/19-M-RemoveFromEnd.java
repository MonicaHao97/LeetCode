class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp = head;
        ListNode point = new ListNode();
        point.next = head;
        int count = 0;
        
        while(temp != null) {
            temp = temp.next;
            count ++;
        }
        
        if(count == n) {
            head = head.next;
            return head;
        }
        
        temp = head;
        for(int i = 0; i < count - n; i ++){
            temp = temp.next;
            point = point.next;
        }
        point.next = temp.next;
        
        return head;
    }
}