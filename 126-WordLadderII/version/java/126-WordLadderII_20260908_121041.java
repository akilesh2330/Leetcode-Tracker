// Last updated: 9/8/2026, 12:10:41 PM
1class Solution {
2    List<List<String>> results = new ArrayList<>();
3    List<String> list = new LinkedList<>();
4    Map<String, List<String>> map = new HashMap<>();
5
6    public List<List<String>> findLadders(
7            String start, String end, List<String> dict) {
8
9        if (!dict.contains(end))
10            return results;
11
12        Queue<String> queue = new ArrayDeque<>();
13        Set<String> unvisited = new HashSet<>(dict);
14        Set<String> visited = new HashSet<>();
15
16        queue.add(start);
17        unvisited.remove(start);
18
19        int curr = 1, next = 0;
20        boolean found = false;
21
22        while (!queue.isEmpty()) {
23
24            String word = queue.poll();
25            curr--;
26
27            for (int i = 0; i < word.length(); i++) {
28
29                StringBuilder sb = new StringBuilder(word);
30
31                for (char ch = 'a'; ch <= 'z'; ch++) {
32
33                    sb.setCharAt(i, ch);
34                    String newWord = sb.toString();
35
36                    if (unvisited.contains(newWord)) {
37
38                        if (visited.add(newWord)) {
39                            queue.add(newWord);
40                            next++;
41                        }
42
43                        map.computeIfAbsent(newWord,
44                                k -> new ArrayList<>()).add(word);
45
46                        if (newWord.equals(end))
47                            found = true;
48                    }
49                }
50            }
51
52            if (curr == 0) {
53
54                if (found)
55                    break;
56
57                curr = next;
58                next = 0;
59
60                unvisited.removeAll(visited);
61                visited.clear();
62            }
63        }
64
65        backTrace(end, start);
66        return results;
67    }
68
69    void backTrace(String word, String start) {
70
71        if (word.equals(start)) {
72            list.add(0, start);
73            results.add(new ArrayList<>(list));
74            list.remove(0);
75            return;
76        }
77
78        list.add(0, word);
79
80        if (map.containsKey(word)) {
81            for (String s : map.get(word))
82                backTrace(s, start);
83        }
84
85        list.remove(0);
86    }
87}