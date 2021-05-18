class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        ListNode end = list1;
        for(int i = 0; i < b; ++i, end = end.next) {
            if(i == a - 1) {
                start = end;
            }
        }
        start.next = list2;
        while(start.next != null) {
            start = start.next;
        }
        start.next = end.next;
        end.next = null;
        return list1;
    }
}