// Last updated: 7/9/2026, 3:10:20 PM
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode a=head;
        while(a!=null&&a.next!=null){
            if(a.next.val==val){
                a.next=a.next.next;
            }else{
                a=a.next;
            }
        }
        return head;
    }
}