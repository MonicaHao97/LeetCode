class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return sort(lists, 0, lists.length - 1);
    }
    
    private ListNode sort(ListNode[] lists, int low, int high) {
        if(low >= high) {
            return lists[low];
        }
        else {
            int mid = (high - low) / 2 + low;
            ListNode left = sort(lists, low, mid);
            ListNode right = sort(lists, mid + 1, high);
            return merge(left, right);
        }
    }
    
    private ListNode merge(ListNode left, ListNode right) {
        if(left == null) {
            return right;
        }
        if(right == null) {
            return left;
        }
        if(left.val <= right.val) {
            left.next =  merge(left.next, right);
            return left;
        }else {
            right.next = merge(left, right.next);
            return right;
        }
    }
}