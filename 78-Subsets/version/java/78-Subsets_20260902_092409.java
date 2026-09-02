// Last updated: 9/2/2026, 9:24:09 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int l = 0, r = nums.length - 1;
4        while (l <= r) {
5            int mid = (l + r) / 2;
6            if (nums[mid] == target)
7                return true;
8            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
9                l++;
10                r--;
11            }
12            else if (nums[l] <= nums[mid]) {
13                if (nums[l] <= target && target < nums[mid])
14                    r = mid - 1;
15                else
16                    l = mid + 1;
17            }
18            else {
19                if (nums[mid] < target && target <= nums[r])
20                    l = mid + 1;
21                else
22                    r = mid - 1;
23            }
24        }
25        return false;
26    }
27}