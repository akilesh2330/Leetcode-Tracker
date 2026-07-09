// Last updated: 7/9/2026, 3:08:56 PM
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int curr = jobs[i][2];
            int next = -1;
            for (int k = i + 1; k < n; k++) {
                if (jobs[k][0] >= jobs[i][1]) {
                    next = k;
                    break;
                }
            }
            int take = curr;
            if (next != -1) {
                take += dp[next];
            }
            int skip = dp[i + 1];
            dp[i] = Math.max(take, skip);
        }
        return dp[0];
    }
}