public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2!=null && t2.next!=null){
            t1 = temp1.next;
            t2 = temp2.next.next;
            if(t1==t2) return true;
        }
        return false;
    }
}
