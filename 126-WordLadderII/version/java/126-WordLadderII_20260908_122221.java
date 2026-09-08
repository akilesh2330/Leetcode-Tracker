// Last updated: 9/8/2026, 12:22:21 PM
1class Solution {
2    List<String> ans = new ArrayList<>();
3    public List<String> addOperators(String num, int target) {
4        dfs(num, target, 0, 0, 0, "");
5        return ans;
6    }
7    void dfs(String s, long target, int pos, long value,
8             long prev, String exp) {
9        if (pos == s.length()) {
10            if (value == target)
11                ans.add(exp);
12            return;
13        }
14        for (int i = pos; i < s.length(); i++) {
15            if (i > pos && s.charAt(pos) == '0')
16                break;
17            long cur = Long.parseLong(s.substring(pos, i + 1));
18            if (pos == 0) {
19                dfs(s, target, i + 1, cur, cur, "" + cur);
20            } else {
21                dfs(s, target, i + 1,
22                    value + cur, cur, exp + "+" + cur);
23                dfs(s, target, i + 1,
24                    value - cur, -cur, exp + "-" + cur);
25                dfs(s, target, i + 1,
26                    value - prev + prev * cur,
27                    prev * cur,
28                    exp + "*" + cur);
29            }
30        }
31    }
32}