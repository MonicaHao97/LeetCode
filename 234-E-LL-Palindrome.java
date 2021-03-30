class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int j = 0;
        int k = list.size() - 1;
        while(j < k){
            if(!list.get(j).equals(list.get(k))){
                return false;
            }
            j ++;
            k --;
        }
        return true;
    }
}