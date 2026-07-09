// Last updated: 7/9/2026, 3:11:36 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=head;
        while(a!=null && a.next!=null){
            if(a.val==a.next.val){
                a.next=a.next.next;
            }else{
                a=a.next;
            }
        }
        return head;
        
    }
}