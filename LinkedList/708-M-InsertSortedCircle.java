class Solution {
    public Node insert(Node head, int insertVal) {
        if(head == null) {
            Node newHead = new Node(insertVal, null);
            newHead.next = newHead;
            return newHead;
        }
        
        Node cur = head;
        while(cur.val <= cur.next.val && cur.next != head) {
            cur = cur.next;
        }
        
        Node max = cur;
        Node dummy = new Node(0, max.next);
        max.next = null;
        cur = dummy;
        while(cur.next != null && cur.next.val < insertVal) {
            cur = cur.next;
        }
        cur.next = new Node(insertVal, cur.next);
        Node newMax = max.next == null ? max : max.next;
        newMax.next = dummy.next;
        
        return head;
    }
}