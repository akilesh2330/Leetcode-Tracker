// Last updated: 8/24/2026, 4:14:56 PM
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n = stones.length;
4        int[] prefix = new int[n];
5        prefix[0] = stones[0];
6        for (int i = 1; i < n; i++) {
7            prefix[i] = prefix[i - 1] + stones[i];
8        }
9        int best = prefix[n - 1];
10        for (int i = n - 2; i >= 1; i--) {
11            best = Math.max(
12                best,
13                prefix[i] - best
14            );
15        }
16
17        return best;
18    }
19}