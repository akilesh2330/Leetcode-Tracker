// Last updated: 7/9/2026, 3:10:13 PM
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b!=null&&b.next!=null){
            a=a.next;
            b=b.next.next;
        }
        ListNode c=null;
        while(a!=null){
            ListNode next=a.next;
            a.next=c;
            c=a;
            a=next;
        }
        while(c!=null){
            
            if(head.val!=c.val){
                return false;
            }
            head=head.next;
            c=c.next;
            
        }
        return true;
        
        
    }
}