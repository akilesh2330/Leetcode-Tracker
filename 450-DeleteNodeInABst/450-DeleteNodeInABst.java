// Last updated: 7/9/2026, 3:09:48 PM
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key) root.right = deleteNode(root.right,key);
        else {
            if(root.left==null && root.right==null) root=null;
            else if(root.left==null || root.right==null){
                if(root.left==null) root=root.right;
                else root=root.left;
            }
            else{
                TreeNode min=minValue(root.right);
                root.val=min.val;
                root.right=deleteNode(root.right,min.val);
                
            } 
        }
        return root;
       
    }
    public TreeNode minValue(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}