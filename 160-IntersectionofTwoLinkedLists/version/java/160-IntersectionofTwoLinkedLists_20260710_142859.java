// Last updated: 7/10/2026, 2:28:59 PM
1public class Solution {
2    public ListNode getIntersectionNode(
3        ListNode headA,
4        ListNode headB
5    ) {
6        ListNode a = headA;
7        ListNode b = headB;
8        while (a != b) {
9            a = (a == null) ? headB : a.next;
10            b = (b == null) ? headA : b.next;
11        }
12        return a;
13    }
14}