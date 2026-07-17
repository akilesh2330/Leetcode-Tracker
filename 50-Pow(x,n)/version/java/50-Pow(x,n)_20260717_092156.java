// Last updated: 7/17/2026, 9:21:56 AM
1class Solution {
2    public double myPow(double x, int n) {
3
4        long N = n;
5
6        if (N < 0) {
7            x = 1 / x;
8            N = -N;
9        }
10
11        double ans = 1;
12        while (N > 0) {
13            if (N % 2 == 1)
14                ans *= x;
15            x *= x;
16            N /= 2;
17        }
18        return ans;
19    }
20}