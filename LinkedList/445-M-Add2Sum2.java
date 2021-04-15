class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        ListNode p1 = l1;
        ListNode p2 = l2;
        while(p1 != null || p2 != null){
            if(p1 != null){
                s1.push(p1.val);
                p1 = p1.next;
            }
            if(p2 != null){
                s2.push(p2.val);
                p2 = p2.next;
            }
        }
        Stack<Integer> s3 = new Stack<Integer>();
        int sum = 0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            sum /= 10;
            if(!s1.isEmpty()){
                sum += s1.pop();
            }
            if(!s2.isEmpty()){
                sum += s2.pop();
            }
            s3.push(sum % 10);
        }
        if(sum >= 10){
            s3.push(1);
        }
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (!s3.isEmpty()){
            result.next = new ListNode(s3.pop());
            result = result.next;
        }
        return temp.next;
    }
}