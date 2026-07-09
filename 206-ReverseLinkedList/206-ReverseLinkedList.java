// Last updated: 7/9/2026, 3:10:18 PM

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a=null;
        ListNode b=head;
        while(b!=null){
            ListNode c=b.next;
            b.next=a;
            a=b;
            b=c;
        }
        return a;
    }
}