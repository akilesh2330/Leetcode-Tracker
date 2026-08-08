// Last updated: 8/8/2026, 4:19:43 PM
1class Solution {
2    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
3
4        TreeSet<Long> set = new TreeSet<>();
5
6        for (int i = 0; i < nums.length; i++) {
7
8            long num = nums[i];
9
10            Long candidate = set.ceiling(num - valueDiff);
11
12            if (candidate != null && candidate <= num + valueDiff) {
13                return true;
14            }
15
16            set.add(num);
17
18            if (i >= indexDiff) {
19                set.remove((long) nums[i - indexDiff]);
20            }
21        }
22
23        return false;
24    }
25}