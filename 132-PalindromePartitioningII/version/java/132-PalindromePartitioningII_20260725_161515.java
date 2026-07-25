// Last updated: 7/25/2026, 4:15:15 PM
1class Solution {
2    public int minCut(String s) {
3
4        int n = s.length();
5
6        boolean[][] palindrome = new boolean[n][n];
7        int[] dp = new int[n];
8
9        for (int i = 0; i < n; i++)
10            dp[i] = i;
11
12        for (int end = 0; end < n; end++) {
13
14            for (int start = 0; start <= end; start++) {
15
16                if (s.charAt(start) == s.charAt(end) &&
17                   (end - start <= 2 || palindrome[start + 1][end - 1])) {
18
19                    palindrome[start][end] = true;
20
21                    if (start == 0)
22                        dp[end] = 0;
23                    else
24                        dp[end] = Math.min(dp[end], dp[start - 1] + 1);
25                }
26            }
27        }
28
29        return dp[n - 1];
30    }
31}