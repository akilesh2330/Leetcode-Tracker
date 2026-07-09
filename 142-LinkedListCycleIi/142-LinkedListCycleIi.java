// Last updated: 7/9/2026, 3:10:58 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a= head;
        ListNode b=head;
        while(a!=null&&a.next!=null){
            a=a.next.next;
            b=b.next;
            if(a==b){
                ListNode c=head;
                while(c!=a){
                    c=c.next;
                    a=a.next;
                } 
                return c;
            }
        }
        return null;
        
    }
}