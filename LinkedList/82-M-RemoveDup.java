class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        
        //Create dummy head to store result
        //Use prev to track prev node
        ListNode newHead = new ListNode(0);
        ListNode temp = head;
        ListNode prev = newHead;
        prev.next = temp;
        
        while(temp != null) {
            //Traverse the list if list not ended and dup finds
            //Temp will stop at last dup node
            while(temp.next != null && temp.val == temp.next.val) {
                temp = temp.next;
            }
            //Check if there exists dup
            //When prev.next is not temp
            //Compare reference, NOT value!
            if(prev.next != temp) {
                //Skip the dups
                //Temp move on, prev stay
                prev.next = temp.next;
                temp = temp.next;
            }else{
            //Else means no dup
            //Move on
                prev = prev.next;
                temp = temp.next;
            }
        }
        
        return newHead.next;
    }
}