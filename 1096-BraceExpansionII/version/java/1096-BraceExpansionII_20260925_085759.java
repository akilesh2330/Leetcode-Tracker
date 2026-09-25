// Last updated: 9/25/2026, 8:57:59 AM
1class Solution {
2    String s;
3    int pos;
4    public List<String> braceExpansionII(String expression) {
5        s = expression;
6        pos = 0;
7        Set<String> ans = expression();
8        return new ArrayList<>(ans);
9    }
10    Set<String> expression() {
11        Set<String> result = new TreeSet<>();
12        result.addAll(concatenation());
13        while (pos < s.length() && s.charAt(pos) == ',') {
14            pos++;
15            result.addAll(concatenation());
16        }
17        return result;
18    }
19    Set<String> concatenation() {
20        Set<String> result = new TreeSet<>();
21        result.add("");
22        while (pos < s.length() &&
23               s.charAt(pos) != '}' &&
24               s.charAt(pos) != ',') {
25            Set<String> part;
26            if (s.charAt(pos) == '{') {
27                pos++;
28                part = expression();
29                pos++; 
30            } else {
31                part = new TreeSet<>();
32                part.add("" + s.charAt(pos));
33                pos++;
34            }
35            result = multiply(result, part);
36        }
37        return result;
38    }
39    Set<String> multiply(Set<String> a, Set<String> b) {
40        Set<String> result = new TreeSet<>();
41        for (String x : a) {
42            for (String y : b) {
43                result.add(x + y);
44            }
45        }
46        return result;
47    }
48}