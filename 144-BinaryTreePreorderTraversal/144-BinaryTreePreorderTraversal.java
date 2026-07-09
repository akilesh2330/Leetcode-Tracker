// Last updated: 7/9/2026, 3:10:55 PM
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }
    void preorder(TreeNode root, List<Integer> arr) {
        if(root == null) {
            return;
        }
        arr.add(root.val);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
}