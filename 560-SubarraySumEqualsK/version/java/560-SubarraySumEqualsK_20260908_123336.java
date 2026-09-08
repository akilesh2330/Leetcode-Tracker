// Last updated: 9/8/2026, 12:33:36 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        map.put(0, 1);
6
7        int sum = 0;
8        int ans = 0;
9
10        for (int x : nums) {
11            sum += x;
12
13            if (map.containsKey(sum - k)) {
14                ans += map.get(sum - k);
15            }
16
17            map.put(sum, map.getOrDefault(sum, 0) + 1);
18        }
19
20        return ans;
21    }
22}