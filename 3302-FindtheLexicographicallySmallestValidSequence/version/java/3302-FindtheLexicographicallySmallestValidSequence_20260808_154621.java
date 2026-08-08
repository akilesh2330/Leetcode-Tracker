// Last updated: 8/8/2026, 3:46:21 PM
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3
4        int n = word1.length();
5        int m = word2.length();
6
7        int[] suffix = new int[n + 1];
8
9        int j = m - 1;
10
11        for (int i = n - 1; i >= 0; i--) {
12            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
13                j--;
14            }
15
16            suffix[i] = m - 1 - j;
17        }
18
19        int[] ans = new int[m];
20        int p = 0;
21        boolean changed = false;
22
23        for (int i = 0; i < n && p < m; i++) {
24
25            if (word1.charAt(i) == word2.charAt(p)) {
26                ans[p] = i;
27                p++;
28            }
29            else if (!changed && suffix[i + 1] >= m - p - 1) {
30                ans[p] = i;
31                p++;
32                changed = true;
33            }
34        }
35
36        if (p != m)
37            return new int[0];
38
39        return ans;
40    }
41}