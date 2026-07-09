// Last updated: 7/9/2026, 3:12:28 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        for(int i = 0; i < k; i++) {
            if(temp == null) {
                return head;
            }
            temp = temp.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count = 0;
        while(curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }
}