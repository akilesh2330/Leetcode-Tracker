// Last updated: 7/9/2026, 3:11:32 PM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }
    void inorder(TreeNode root, List<Integer> arr) {
        if(root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}