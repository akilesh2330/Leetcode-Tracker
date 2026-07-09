// Last updated: 7/9/2026, 3:12:29 PM
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for(ListNode node : lists) {
            while(node != null) {
                arr.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return dummy.next;
    }
}