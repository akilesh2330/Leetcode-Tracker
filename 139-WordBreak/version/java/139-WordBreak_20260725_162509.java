// Last updated: 7/25/2026, 4:25:09 PM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Set<String> set = new HashSet<>(wordDict);
4        boolean[] dp = new boolean[s.length() + 1];
5        dp[0] = true;
6        for (int i = 1; i <= s.length(); i++) {
7            for (int j = 0; j < i; j++) {
8                if (dp[j] && set.contains(s.substring(j, i))) {
9                    dp[i] = true;
10                    break;
11                }
12            }
13        }
14        return dp[s.length()];
15    }
16}