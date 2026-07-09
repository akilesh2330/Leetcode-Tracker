// Last updated: 7/9/2026, 3:11:26 PM

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> id=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                id.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            ans.add(id);
        }
        return ans;

    }
}