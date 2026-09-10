// Last updated: 9/10/2026, 2:51:20 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> ans = new ArrayList<>();
4
5        int i = 0;
6
7        while (i < nums.length) {
8            int start = nums[i];
9
10            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
11                i++;
12            }
13
14            if (start == nums[i])
15                ans.add("" + start);
16            else
17                ans.add(start + "->" + nums[i]);
18
19            i++;
20        }
21
22        return ans;
23    }
24}