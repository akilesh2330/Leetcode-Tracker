// Last updated: 7/9/2026, 3:11:09 PM
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root) {

        if(root == null) {
            return 0;
        }
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        int current = root.val + left + right;
        max = Math.max(max, current);
        return root.val + Math.max(left, right);
    }
}