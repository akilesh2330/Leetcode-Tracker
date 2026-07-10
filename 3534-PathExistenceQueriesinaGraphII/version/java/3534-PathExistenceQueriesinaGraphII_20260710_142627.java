// Last updated: 7/10/2026, 2:26:27 PM
1class Solution {
2    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[][] valueWithIdx = new int[n][2];
4        for (int i = 0; i < n; i++) valueWithIdx[i] = new int[]{nums[i], i};
5        Arrays.sort(valueWithIdx, (leftPos, rightPos) -> leftPos[0] - rightPos[0]);
6        int[] sortedPos = new int[n];
7        for (int i = 0; i < n; i++) sortedPos[valueWithIdx[i][1]] = i;
8        int[][] jump = new int[n][18];
9        int reach = 0;
10        for (int i = 0; i < n; i++) {
11            if (reach < i) reach = i;
12            while (reach + 1 < n && valueWithIdx[reach + 1][0] - valueWithIdx[reach][0] <= maxDiff && valueWithIdx[reach + 1][0] - valueWithIdx[i][0] <= maxDiff) reach++;
13            jump[i][0] = reach;
14        }
15        for (int j = 1; j < 18; j++) for (int i = 0; i < n; i++) jump[i][j] = jump[jump[i][j - 1]][j - 1];
16        int[] result = new int[queries.length];
17        for (int i = 0; i < queries.length; i++) {
18            int leftPos = sortedPos[queries[i][0]], rightPos = sortedPos[queries[i][1]];
19            if (leftPos > rightPos) { int t = leftPos; leftPos = rightPos; rightPos = t; }
20            if (leftPos == rightPos) { result[i] = 0; continue; }
21            int currPos = leftPos, steps = 0;
22            for (int j = 17; j >= 0; j--) if (jump[currPos][j] < rightPos) { currPos = jump[currPos][j]; steps += (1 << j); }
23            result[i] = (jump[currPos][0] >= rightPos) ? steps + 1 : -1;
24        }
25        return result;
26    }
27}