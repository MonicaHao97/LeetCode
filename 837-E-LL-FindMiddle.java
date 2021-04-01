class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fastRunner = head;
        ListNode slowRunner = head;
        while(fastRunner!= null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        return slowRunner;
    }
}