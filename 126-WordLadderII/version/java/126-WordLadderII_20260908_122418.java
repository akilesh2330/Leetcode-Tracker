// Last updated: 9/8/2026, 12:24:18 PM
1class Solution {
2    List<String> ans = new ArrayList<>();
3    public List<String> removeInvalidParentheses(String s) {
4        dfs(s, 0, 0, new char[]{'(', ')'});
5        return ans;
6    }
7    void dfs(String s, int start, int check, char[] p) {
8        int count = 0;
9        for (int i = check; i < s.length(); i++) {
10            if (s.charAt(i) == p[0]) count++;
11            if (s.charAt(i) == p[1]) count--;
12            if (count >= 0) continue;
13            for (int j = start; j <= i; j++) {
14                if (s.charAt(j) == p[1] &&
15                    (j == start || s.charAt(j - 1) != p[1])) {
16                    dfs(s.substring(0, j) + s.substring(j + 1),
17                        j, i, p);
18                }
19            }
20            return;
21        }
22        String reversed = new StringBuilder(s).reverse().toString();
23        if (p[0] == '(') {
24            dfs(reversed, 0, 0, new char[]{')', '('});
25        } else {
26            ans.add(reversed);
27        }
28    }
29}