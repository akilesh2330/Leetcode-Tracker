// Last updated: 9/8/2026, 9:06:02 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        long sum = 0;
5        long ans = 0;
6        for (int i = 0; i < nums.length; i++) {
7            sum += nums[i];
8            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
9            if (i >= k) {
10                sum -= nums[i - k];
11                map.put(nums[i - k], map.get(nums[i - k]) - 1);
12                if (map.get(nums[i - k]) == 0)
13                    map.remove(nums[i - k]);
14            }
15            if (i >= k - 1 && map.size() == k) {
16                ans = Math.max(ans, sum);
17            }
18        }
19        return ans;
20    }
21}