// Last updated: 7/9/2026, 3:11:06 PM
class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int j = 0; j < n; j++) {
            if(board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if(board[m - 1][j] == 'O') {
                dfs(board, m - 1, j);
            }
        }
        for(int i = 0; i < m; i++) {
            if(board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if(board[i][n - 1] == 'O') {
                dfs(board, i, n - 1);
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    void dfs(char[][] board, int r, int c) {
        if(r < 0 ||
           c < 0 ||
           r >= board.length ||
           c >= board[0].length ||
           board[r][c] != 'O') {
            return;
        }
        board[r][c] = '#';
        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}