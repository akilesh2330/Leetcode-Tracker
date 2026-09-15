// Last updated: 9/15/2026, 9:16:29 AM
1class Solution {
2    public int maxPalindromes(String s, int k) {
3        int n = s.length();
4        int[] dp = new int[n + 1];
5
6        for (int i = 1; i <= n; i++) {
7            dp[i] = dp[i - 1];
8
9            // Odd length palindrome
10            int l = i - k;
11            if (l >= 0 && isPal(s, l, i - 1)) {
12                dp[i] = Math.max(dp[i], dp[l] + 1);
13            }
14
15            // Even length palindrome
16            l = i - k - 1;
17            if (l >= 0 && isPal(s, l, i - 1)) {
18                dp[i] = Math.max(dp[i], dp[l] + 1);
19            }
20        }
21
22        return dp[n];
23    }
24
25    boolean isPal(String s, int l, int r) {
26        while (l < r) {
27            if (s.charAt(l++) != s.charAt(r--))
28                return false;
29        }
30        return true;
31    }
32}