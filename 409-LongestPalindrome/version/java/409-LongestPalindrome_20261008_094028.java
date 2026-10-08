// Last updated: 10/8/2026, 9:40:28 AM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count = new int[128];
4        for (char c : s.toCharArray())
5            count[c]++;
6        int ans = 0;
7        boolean odd = false;
8        for (int x : count) {
9            ans += (x / 2) * 2;
10            if (x % 2 == 1)
11                odd = true;
12        }
13        if (odd)
14            ans++;
15        return ans;
16    }
17}