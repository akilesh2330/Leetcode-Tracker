// Last updated: 10/21/2026, 12:02:15 PM
1class Solution {
2    public int sortableIntegers(int[] nums) {
3        int n = nums.length;
4        int[] prefMax = new int[n + 1];
5        int[] suffMin = new int[n + 1];
6        int[] drops = new int[n];
7        for (int i = 0; i < n; i++)
8            prefMax[i + 1] = Math.max(prefMax[i], nums[i]);
9        suffMin[n] = Integer.MAX_VALUE;
10        for (int i = n - 1; i >= 0; i--)
11            suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
12        for (int i = 1; i < n; i++)
13            drops[i] = drops[i - 1] + (nums[i - 1] > nums[i] ? 1 : 0);
14        int ans = 0;
15        for (int k = 1; k <= n / k; k++) {
16            if (n % k == 0) {
17                if (check(nums, prefMax, suffMin, drops, k))
18                    ans += k;
19                int other = n / k;
20                if (other != k && check(nums, prefMax, suffMin, drops, other))ans += other;
21            }
22        }
23        return ans;
24    }
25    private boolean check(int[] nums, int[] prefMax,int[] suffMin, int[] drops, int k) {
26        int n = nums.length;
27        for (int start = 0; start < n; start += k) {
28            int end = start + k - 1;
29            int count = drops[end] - drops[start];
30            if (nums[end] > nums[start])
31                count++;
32            if (count > 1 || prefMax[start] > suffMin[start])
33                return false;
34        }
35        return true;
36    }
37}