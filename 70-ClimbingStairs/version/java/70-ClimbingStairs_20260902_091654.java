// Last updated: 9/2/2026, 9:16:54 AM
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 2) {
4            return n;
5        }
6        int a = 1;
7        int b = 2;
8        for (int i = 3; i <= n; i++) {
9            int c = a + b;
10            a = b;
11            b = c;
12        }
13        return b;
14    }
15}