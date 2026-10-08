// Last updated: 10/8/2026, 9:24:51 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1 = new HashSet<>();
4        HashSet<Integer> ans = new HashSet<>();
5        for (int x : nums1)
6            set1.add(x);
7        for (int x : nums2) {
8            if (set1.contains(x))
9                ans.add(x);
10        }
11        int[] result = new int[ans.size()];
12        int i = 0;
13        for (int x : ans)
14            result[i++] = x;
15        return result;
16    }
17}