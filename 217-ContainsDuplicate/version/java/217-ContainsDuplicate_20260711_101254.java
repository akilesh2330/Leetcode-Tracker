// Last updated: 7/11/2026, 10:12:54 AM
1import java.util.*;
2class Solution {
3    public boolean containsDuplicate(int[] nums) {
4        HashSet<Integer> set = new HashSet<>();
5        for (int num : nums) {
6            if (set.contains(num)) {
7                return true;
8            }
9            set.add(num);
10        }
11        return false;
12    }
13}