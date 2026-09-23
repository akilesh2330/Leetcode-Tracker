// Last updated: 9/23/2026, 9:06:36 AM
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int total = 0;
4
5        for (int n : nums)
6            total += n;
7
8        int target = total - x;
9
10        if (target < 0)
11            return -1;
12
13        int left = 0, sum = 0, maxLen = -1;
14
15        for (int right = 0; right < nums.length; right++) {
16            sum += nums[right];
17
18            while (sum > target && left <= right)
19                sum -= nums[left++];
20
21            if (sum == target)
22                maxLen = Math.max(maxLen, right - left + 1);
23        }
24
25        if (target == 0)
26            return nums.length;
27
28        return maxLen == -1 ? -1 : nums.length - maxLen;
29    }
30}