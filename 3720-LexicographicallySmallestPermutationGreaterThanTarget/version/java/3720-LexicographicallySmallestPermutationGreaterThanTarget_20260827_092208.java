// Last updated: 8/27/2026, 9:22:08 AM
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int n = s.length();
4        int[] cnt = new int[26];
5        for (char c : s.toCharArray()) {
6            cnt[c - 'a']++;
7        }
8        for (int i = n - 1; i >= 0; i--) {
9            int[] remain = cnt.clone();
10            boolean possible = true;
11            for (int j = 0; j < i; j++) {
12                int x = target.charAt(j) - 'a';
13                if (remain[x] == 0) {
14                    possible = false;
15                    break;
16                }
17                remain[x]--;
18            }
19            if (!possible)
20                continue;
21            int targetChar = target.charAt(i) - 'a';
22            for (int c = targetChar + 1; c < 26; c++) {
23                if (remain[c] == 0)
24                    continue;
25                StringBuilder ans = new StringBuilder(target.substring(0, i));
26                ans.append((char) ('a' + c));
27                remain[c]--;
28                for (int x = 0; x < 26; x++) {
29                    for (int t = 0; t < remain[x]; t++) {
30                        ans.append((char) ('a' + x));
31                    }
32                }
33                return ans.toString();
34            }
35        }
36        return "";
37    }
38}