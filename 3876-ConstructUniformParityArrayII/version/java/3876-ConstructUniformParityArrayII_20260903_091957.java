// Last updated: 9/3/2026, 9:19:57 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int minOdd = Integer.MAX_VALUE;
4        for (int x : nums1) {
5            if (x % 2 == 1) {
6                minOdd = Math.min(minOdd, x);
7            }
8        }
9        for (int x : nums1) {
10            if (x % 2 == 0 && minOdd != Integer.MAX_VALUE && x < minOdd) {
11                return false;
12            }
13        }
14        return true;
15    }
16}