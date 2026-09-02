// Last updated: 9/2/2026, 9:24:59 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode prev = dummy;
6        while (head != null) {
7            if (head.next != null && head.val == head.next.val) {
8                int value = head.val;
9                while (head != null && head.val == value) {
10                    head = head.next;
11                }
12                prev.next = head;
13            } else {
14                prev = head;
15                head = head.next;
16            }
17        }
18        return dummy.next;
19    }
20}