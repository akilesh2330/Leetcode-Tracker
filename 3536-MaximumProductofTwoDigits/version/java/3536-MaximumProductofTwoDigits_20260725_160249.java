// Last updated: 7/25/2026, 4:02:49 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0, max2 = 0;
4
5        while (n > 0) {
6            int digit = n % 10;
7
8            if (digit > max1) {
9                max2 = max1;
10                max1 = digit;
11            } else if (digit > max2) {
12                max2 = digit;
13            }
14
15            n /= 10;
16        }
17
18        return max1 * max2;
19    }
20}