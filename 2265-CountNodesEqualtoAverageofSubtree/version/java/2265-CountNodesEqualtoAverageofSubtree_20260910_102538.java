// Last updated: 9/10/2026, 10:25:38 AM
1class Solution {
2    int ans = 0;
3
4    public int averageOfSubtree(TreeNode root) {
5        dfs(root);
6        return ans;
7    }
8
9    int[] dfs(TreeNode root) {
10        if (root == null)
11            return new int[]{0, 0};
12
13        int[] left = dfs(root.left);
14        int[] right = dfs(root.right);
15
16        int sum = left[0] + right[0] + root.val;
17        int count = left[1] + right[1] + 1;
18
19        if (root.val == sum / count)
20            ans++;
21
22        return new int[]{sum, count};
23    }
24}