// Last updated: 8/8/2026, 4:16:28 PM
1import java.util.Queue;
2import java.util.LinkedList;
3
4public class Codec {
5
6    public String serialize(TreeNode root) {
7        if (root == null) {
8            return "null";
9        }
10
11        return root.val + "," +
12               serialize(root.left) + "," +
13               serialize(root.right);
14    }
15
16    public TreeNode deserialize(String data) {
17        String[] values = data.split(",");
18        Queue<String> queue = new LinkedList<>();
19
20        for (String value : values) {
21            queue.offer(value);
22        }
23
24        return buildTree(queue);
25    }
26
27    private TreeNode buildTree(Queue<String> queue) {
28        String value = queue.poll();
29
30        if (value.equals("null")) {
31            return null;
32        }
33
34        TreeNode root = new TreeNode(Integer.parseInt(value));
35
36        root.left = buildTree(queue);
37        root.right = buildTree(queue);
38
39        return root;
40    }
41}