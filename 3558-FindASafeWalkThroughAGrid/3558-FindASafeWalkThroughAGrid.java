// Last updated: 7/9/2026, 3:07:54 PM
class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int startHealth = health - grid.get(0).get(0);
        if (startHealth <= 0) return false;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, startHealth});
        boolean[][][] vis = new boolean[m][n][health + 1];
        vis[0][0][startHealth] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            int h = cur[2];
            if (r == m - 1 && c == n - 1)
                return true;
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                    continue;
                int nh = h - grid.get(nr).get(nc);
                if (nh <= 0)
                    continue;
                if (!vis[nr][nc][nh]) {
                    vis[nr][nc][nh] = true;
                    q.offer(new int[]{nr, nc, nh});
                }
            }
        }

        return false;
    }
}