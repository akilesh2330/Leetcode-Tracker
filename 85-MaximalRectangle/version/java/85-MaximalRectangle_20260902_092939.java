// Last updated: 9/2/2026, 9:29:39 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix.length == 0) return 0;
4        int n = matrix[0].length;
5        int[] height = new int[n];
6        int ans = 0;
7        for (char[] row : matrix) {
8            for (int j = 0; j < n; j++) {
9                if (row[j] == '1')
10                    height[j]++;
11                else
12                    height[j] = 0;
13            }
14            ans = Math.max(ans, largestRectangle(height));
15        }
16        return ans;
17    }
18    int largestRectangle(int[] h) {
19        int ans = 0;
20        for (int i = 0; i < h.length; i++) {
21            int min = h[i];
22            for (int j = i; j < h.length; j++) {
23                min = Math.min(min, h[j]);
24                ans = Math.max(ans, min * (j - i + 1));
25            }
26        }
27        return ans;
28    }
29}