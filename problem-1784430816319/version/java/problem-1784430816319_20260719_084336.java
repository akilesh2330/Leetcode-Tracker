// Last updated: 7/19/2026, 8:43:36 AM
1class Solution {
2    int count=0;
3    public int countDominantNodes(TreeNode root) {
4        dfs(root);
5        return count;
6    }
7    private int dfs(TreeNode node){
8        if(node==null) return Integer.MIN_VALUE;
9        int left=dfs(node.left);
10        int right=dfs(node.right);
11        int max= Math.max(node.val, Math.max(left,right));
12        if(node.val==max) count++;
13        return max;
14    }
15}