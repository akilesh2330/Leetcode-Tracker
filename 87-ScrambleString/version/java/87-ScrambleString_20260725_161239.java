// Last updated: 7/25/2026, 4:12:39 PM
1class Solution {
2
3    HashMap<String, Boolean> memo = new HashMap<>();
4
5    public boolean isScramble(String s1, String s2) {
6
7        if (s1.equals(s2))
8            return true;
9
10        String key = s1 + "#" + s2;
11
12        if (memo.containsKey(key))
13            return memo.get(key);
14
15        if (s1.length() != s2.length()) {
16            memo.put(key, false);
17            return false;
18        }
19
20        int[] count = new int[26];
21
22        for (int i = 0; i < s1.length(); i++) {
23            count[s1.charAt(i) - 'a']++;
24            count[s2.charAt(i) - 'a']--;
25        }
26
27        for (int x : count) {
28            if (x != 0) {
29                memo.put(key, false);
30                return false;
31            }
32        }
33
34        int n = s1.length();
35
36        for (int i = 1; i < n; i++) {
37
38            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
39                isScramble(s1.substring(i), s2.substring(i))) {
40
41                memo.put(key, true);
42                return true;
43            }
44
45            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
46                isScramble(s1.substring(i), s2.substring(0, n - i))) {
47
48                memo.put(key, true);
49                return true;
50            }
51        }
52
53        memo.put(key, false);
54        return false;
55    }
56}