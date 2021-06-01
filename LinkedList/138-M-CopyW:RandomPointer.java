class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node next;
        
        //First, make a deep copy of each node and connect the copy to the next
        while(temp != null) {
            next = temp.next;
            
            Node copy = new Node(temp.val);
            copy.next = next;
            temp.next = copy;
            temp = next;
        }
        
        //reset temp = head; then copy each node's random pointer if exists
        temp = head;
        while(temp != null) {            
            if(temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        
        //create a dummy head to store the new list
        //access the copied node, connect to it to newHead
        //restore the original list
        temp = head;
        Node newHead = new Node(0);
        Node copy = head;
        Node iter = newHead;
        while(temp != null) {
            next = temp.next.next;
            
            copy = temp.next;
            iter.next = copy;
            iter = copy;
            temp.next = next;
            
            temp = next;
        }
        
        return newHead.next;
    }
}