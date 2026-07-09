// Last updated: 7/9/2026, 3:09:01 PM
class Solution {
    Integer[][] dp;
    public int solve(String text1, String text2, int i, int j) {
        if (i == text1.length() || j == text2.length())
            return 0;
        if (dp[i][j] != null)
            return dp[i][j];
        if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + solve(text1, text2, i + 1, j + 1);
        } else {
            dp[i][j] = Math.max(
                    solve(text1, text2, i + 1, j),
                    solve(text1, text2, i, j + 1));
        }
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new Integer[text1.length()][text2.length()];
        return solve(text1, text2, 0, 0);
    }
}