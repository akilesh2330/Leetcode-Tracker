// Last updated: 10/8/2026, 9:46:04 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        for (int x : nums) {
5            int index = Math.abs(x) - 1;
6            nums[index] = -Math.abs(nums[index]);
7        }
8        for (int i = 0; i < nums.length; i++) {
9            if (nums[i] > 0)
10                ans.add(i + 1);
11        }
12        return ans;
13    }
14}