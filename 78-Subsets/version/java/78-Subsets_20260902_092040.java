// Last updated: 9/2/2026, 9:20:40 AM
1class Solution {
2    List<List<Integer>> ans = new ArrayList<>();
3    public List<List<Integer>> subsets(int[] nums) {
4        backtrack(nums, 0, new ArrayList<>());
5        return ans;
6    }
7    private void backtrack(int[] nums, int start, List<Integer> current) {
8        ans.add(new ArrayList<>(current));
9        for (int i = start; i < nums.length; i++) {
10            current.add(nums[i]);
11            backtrack(nums, i + 1, current);
12            current.remove(current.size() - 1);
13        }
14    }
15}