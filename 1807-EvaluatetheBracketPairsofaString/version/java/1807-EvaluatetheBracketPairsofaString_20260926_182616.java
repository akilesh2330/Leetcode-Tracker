// Last updated: 9/26/2026, 6:26:16 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3        HashMap<String, String> map = new HashMap<>();
4        for (List<String> pair : knowledge) {
5            map.put(pair.get(0), pair.get(1));
6        }
7        StringBuilder ans = new StringBuilder();
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) == '(') {
10                int j = i + 1;
11                while (s.charAt(j) != ')')
12                    j++;
13                String key = s.substring(i + 1, j);
14                if (map.containsKey(key))
15                    ans.append(map.get(key));
16                else
17                    ans.append("?");
18
19                i = j;
20            } 
21            else {
22                ans.append(s.charAt(i));
23            }
24        }
25        return ans.toString();
26    }
27}