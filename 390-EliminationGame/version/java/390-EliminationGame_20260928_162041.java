// Last updated: 9/28/2026, 4:20:41 PM
1class Solution {
2    public int lastRemaining(int n) {
3        int head = 1;
4        int step = 1;
5        boolean left = true;
6        while (n > 1) {
7            if (left || n % 2 == 1)
8                head += step;
9            n /= 2;
10            step *= 2;
11            left = !left;
12        }
13        return head;
14    }
15}