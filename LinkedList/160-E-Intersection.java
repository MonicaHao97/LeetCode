/**
 Definition for singly-linked list.*/
 public class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int count = 0;
        
        if (headA == null || headB == null){
            return null;
        }
        
        while(tempA != tempB && count < 3){
            if (tempA == null){
                count ++;
                tempA = headB;
            }
            else{
                tempA = tempA.next;
            }
            if(tempB == null){
                count ++;
                tempB = headA;
            }
            else{
                tempB = tempB.next;
            }
        }
        return tempA;
    }
}