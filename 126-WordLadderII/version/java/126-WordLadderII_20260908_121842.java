// Last updated: 9/8/2026, 12:18:42 PM
1class Solution {
2    public int countDigitOne(int n) {
3        long place = 1;
4        int ans = 0;
5        while (place <= n) {
6            long high = n / (place * 10);
7            long cur = (n / place) % 10;
8            long low = n % place;
9            if (cur == 0)
10                ans += high * place;
11            else if (cur == 1)
12                ans += high * place + low + 1;
13            else
14                ans += (high + 1) * place;
15            place *= 10;
16        }
17        return ans;
18    }
19}