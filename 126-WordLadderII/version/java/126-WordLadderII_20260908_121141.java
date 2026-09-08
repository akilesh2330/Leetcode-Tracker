// Last updated: 9/8/2026, 12:11:41 PM
1class Solution {
2    public int candy(int[] ratings) {
3        int n = ratings.length;
4        int[] candy = new int[n];
5
6        for (int i = 0; i < n; i++)
7            candy[i] = 1;
8
9        for (int i = 1; i < n; i++) {
10            if (ratings[i] > ratings[i - 1])
11                candy[i] = candy[i - 1] + 1;
12        }
13
14        for (int i = n - 2; i >= 0; i--) {
15            if (ratings[i] > ratings[i + 1])
16                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
17        }
18
19        int ans = 0;
20
21        for (int x : candy)
22            ans += x;
23
24        return ans;
25    }
26}