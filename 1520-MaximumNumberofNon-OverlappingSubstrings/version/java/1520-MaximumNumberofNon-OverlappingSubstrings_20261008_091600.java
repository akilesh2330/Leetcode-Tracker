// Last updated: 10/8/2026, 9:16:00 AM
1class Solution {
2    public List<String> maxNumOfSubstrings(String s) {
3        int n = s.length();
4        int[] first = new int[26];
5        int[] last = new int[26];
6        Arrays.fill(first, n);
7        Arrays.fill(last, -1);
8        for (int i = 0; i < n; i++) {
9            int x = s.charAt(i) - 'a';
10            first[x] = Math.min(first[x], i);
11            last[x] = i;
12        }
13        List<int[]> ranges = new ArrayList<>();
14        for (int c = 0; c < 26; c++) {
15            if (last[c] == -1)
16                continue;
17            int l = first[c];
18            int r = last[c];
19            boolean valid = true;
20            for (int i = l; i <= r; i++) {
21                int x = s.charAt(i) - 'a';
22                if (first[x] < l) {
23                    valid = false;
24                    break;
25                }
26                r = Math.max(r, last[x]);
27            }
28            if (valid)
29                ranges.add(new int[]{l, r});
30        }
31        ranges.sort((a, b) -> a[1] - b[1]);
32        List<String> ans = new ArrayList<>();
33        int end = -1;
34        for (int[] range : ranges) {
35            if (range[0] > end) {
36                ans.add(s.substring(range[0], range[1] + 1));
37                end = range[1];
38            }
39        }
40        return ans;
41    }
42}