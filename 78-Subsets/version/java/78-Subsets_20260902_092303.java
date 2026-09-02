// Last updated: 9/2/2026, 9:23:03 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 0;
4        for (int x : nums) {
5            if (k < 2 || x != nums[k - 2]) {
6                nums[k] = x;
7                k++;
8            }
9        }
10        return k;
11    }
12}