// Last updated: 10/21/2026, 9:26:25 AM
1class Solution {
2    public int minOperations(String s) {
3        int n = s.length();
4        boolean sorted = true;
5        for (int i = 1; i < n; i++) {
6            if (s.charAt(i) < s.charAt(i - 1)) {
7                sorted = false;
8                break;
9            }
10        }
11        if (sorted) return 0;
12        if (n == 2) return -1;
13        char min = 'z', max = 'a';
14        for (char c : s.toCharArray()) {
15            min = (char) Math.min(min, c);
16            max = (char) Math.max(max, c);
17        }
18        if (s.charAt(0) == min || s.charAt(n - 1) == max)
19            return 1;
20        for (int i = 1; i < n - 1; i++) {
21            if (s.charAt(i) == min || s.charAt(i) == max)
22                return 2;
23        }
24        return 3;
25    }
26}