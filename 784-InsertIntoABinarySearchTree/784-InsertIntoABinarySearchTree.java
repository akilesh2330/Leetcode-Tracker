// Last updated: 7/9/2026, 3:09:16 PM
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        if(val<root.val) root.left= insertIntoBST(root.left,val);
        else root.right=insertIntoBST(root.right,val);
        return root;

    }
}