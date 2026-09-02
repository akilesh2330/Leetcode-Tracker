// Last updated: 9/2/2026, 9:19:06 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        boolean firstRow = false;
6        boolean firstCol = false;
7        for (int j = 0; j < n; j++) {
8            if (matrix[0][j] == 0) {
9                firstRow = true;
10            }
11        }
12        for (int i = 0; i < m; i++) {
13            if (matrix[i][0] == 0) {
14                firstCol = true;
15            }
16        }
17        for (int i = 1; i < m; i++) {
18            for (int j = 1; j < n; j++) {
19                if (matrix[i][j] == 0) {
20                    matrix[i][0] = 0;
21                    matrix[0][j] = 0;
22                }
23            }
24        }
25        for (int i = 1; i < m; i++) {
26            for (int j = 1; j < n; j++) {
27                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
28                    matrix[i][j] = 0;
29                }
30            }
31        }
32        if (firstRow) {
33            for (int j = 0; j < n; j++) {
34                matrix[0][j] = 0;
35            }
36        }
37        if (firstCol) {
38            for (int i = 0; i < m; i++) {
39                matrix[i][0] = 0;
40            }
41        }
42    }
43}