class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        //Break into halves
        //Use prev node to break list
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        //Use recursion to break each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        //Merge each node
        return mergeList(l1, l2);
    }
    
    public ListNode mergeList(ListNode l1, ListNode l2) {
        //Create newHead to store result
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        
        //Traverse l1 & l2
        //Compare values and connect temp with smaller one
        while(l1 != null && l2 != null) {
            if(l1.val >= l2.val) {
                temp.next = l2;
                l2 = l2.next;
            }else{
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        
        //Add the rest nodes
        if(l1 != null) {
            temp.next = l1;
        }
        
        if(l2 != null) {
            temp.next = l2;
        }
        
        return newHead.next;
    }
}