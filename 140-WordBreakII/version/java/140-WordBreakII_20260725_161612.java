// Last updated: 7/25/2026, 4:16:12 PM
1class Solution {
2
3    Set<String> dict;
4    Map<String, List<String>> memo = new HashMap<>();
5
6    public List<String> wordBreak(String s, List<String> wordDict) {
7
8        dict = new HashSet<>(wordDict);
9
10        return dfs(s);
11    }
12
13    private List<String> dfs(String s) {
14
15        if (memo.containsKey(s))
16            return memo.get(s);
17
18        List<String> res = new ArrayList<>();
19
20        if (s.length() == 0) {
21            res.add("");
22            return res;
23        }
24
25        for (String word : dict) {
26
27            if (!s.startsWith(word))
28                continue;
29
30            List<String> sub = dfs(s.substring(word.length()));
31
32            for (String str : sub) {
33
34                if (str.equals(""))
35                    res.add(word);
36                else
37                    res.add(word + " " + str);
38            }
39        }
40
41        memo.put(s, res);
42
43        return res;
44    }
45}