// Last updated: 9/29/2026, 6:50:39 PM
1class Solution {
2    public boolean hasValidPath(char[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(')
8            return false;
9
10        if ((m + n - 1) % 2 == 1)
11            return false;
12
13        Boolean[][][] dp = new Boolean[m][n][m + n];
14
15        return dfs(grid, 0, 0, 0, dp);
16    }
17
18    boolean dfs(char[][] grid, int r, int c, int balance,
19                Boolean[][][] dp) {
20
21        if (grid[r][c] == '(')
22            balance++;
23        else
24            balance--;
25
26        if (balance < 0)
27            return false;
28
29        if (r == grid.length - 1 && c == grid[0].length - 1)
30            return balance == 0;
31
32        if (dp[r][c][balance] != null)
33            return dp[r][c][balance];
34
35        boolean down = false;
36        boolean right = false;
37
38        if (r + 1 < grid.length)
39            down = dfs(grid, r + 1, c, balance, dp);
40
41        if (c + 1 < grid[0].length)
42            right = dfs(grid, r, c + 1, balance, dp);
43
44        return dp[r][c][balance] = down || right;
45    }
46}