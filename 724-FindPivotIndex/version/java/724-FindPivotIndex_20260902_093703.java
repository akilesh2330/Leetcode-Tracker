// Last updated: 9/2/2026, 9:37:03 AM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total = 0;
4        for (int x : nums)
5            total += x;
6        int left = 0;
7        for (int i = 0; i < nums.length; i++) {
8            int right = total - left - nums[i];
9            if (left == right)
10                return i;
11            left += nums[i];
12        }
13        return -1;
14    }
15}