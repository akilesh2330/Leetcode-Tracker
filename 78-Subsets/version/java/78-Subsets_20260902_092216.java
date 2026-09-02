// Last updated: 9/2/2026, 9:22:16 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for (int i = 0; i < board.length; i++) {
4            for (int j = 0; j < board[0].length; j++) {
5                if (dfs(board, word, i, j, 0))
6                    return true;
7            }
8        }
9        return false;
10    }
11    boolean dfs(char[][] b, String w, int i, int j, int k) {
12        if (k == w.length()) return true;
13        if (i < 0 || j < 0 || i >= b.length || j >= b[0].length)
14            return false;
15        if (b[i][j] != w.charAt(k))
16            return false;
17        char temp = b[i][j];
18        b[i][j] = '#';
19        boolean ans = dfs(b,w,i+1,j,k+1) ||
20                      dfs(b,w,i-1,j,k+1) ||
21                      dfs(b,w,i,j+1,k+1) ||
22                      dfs(b,w,i,j-1,k+1);
23
24        b[i][j] = temp;
25        return ans;
26    }
27}