class Solution {
    public ListNode partition(ListNode head, int x) {
        //Create two linked list for smaller and bigger values
        //Each starts with a dummy head
        ListNode smaller = new ListNode (0);
        ListNode temp1 = smaller;
        ListNode bigger = new ListNode(0);
        ListNode temp2 = bigger;
        
        //Traverse through the given list with head node
        //Add each node into smaller/bigger list
        while(head != null) {
            if(head.val < x) {
                temp1.next = head;
                temp1 = temp1.next;
            }else{
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
        }
        //Avoid circle
        //Make bigger list ends null
        //connect smaller and bigger
        temp2.next = null;
        temp1.next = bigger.next;
        
        return smaller.next;
    }
}