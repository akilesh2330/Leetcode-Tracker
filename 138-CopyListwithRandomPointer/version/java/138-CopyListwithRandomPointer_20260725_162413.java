// Last updated: 7/25/2026, 4:24:13 PM
1class Solution {
2    public Node copyRandomList(Node head) {
3        if (head == null)
4            return null;
5        HashMap<Node, Node> map = new HashMap<>();
6        Node curr = head;
7        while (curr != null) {
8            map.put(curr, new Node(curr.val));
9            curr = curr.next;
10        }
11        curr = head;
12        while (curr != null) {
13            map.get(curr).next = map.get(curr.next);
14            map.get(curr).random = map.get(curr.random);
15            curr = curr.next;
16        }
17
18        return map.get(head);
19    }
20}