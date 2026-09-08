// Last updated: 9/8/2026, 12:16:07 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int l = 0, r = nums.length - 1;
4        while (l < r) {
5            int mid = l + (r - l) / 2;
6            if (nums[mid] < nums[r]) {
7                r = mid;
8            }
9            else if (nums[mid] > nums[r]) {
10                l = mid + 1;
11            }
12            else {
13                r--;
14            }
15        }
16        return nums[l];
17    }
18}