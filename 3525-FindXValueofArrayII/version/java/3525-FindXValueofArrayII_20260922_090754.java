// Last updated: 9/22/2026, 9:07:54 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        boolean[] seen = new boolean[1000];
4        for (int i = 0; i < digits.length; i++) {
5            for (int j = 0; j < digits.length; j++) {
6                for (int k = 0; k < digits.length; k++) {
7                    if (i == j || i == k || j == k)
8                        continue;
9                    if (digits[i] == 0)
10                        continue;
11                    if (digits[k] % 2 != 0)
12                        continue;
13                    int num = digits[i] * 100+ digits[j] * 10+ digits[k];
14                    seen[num] = true;
15                }
16            }
17        }
18        int ans = 0;
19        for (boolean x : seen) {
20            if (x)
21                ans++;
22        }
23        return ans;
24    }
25}