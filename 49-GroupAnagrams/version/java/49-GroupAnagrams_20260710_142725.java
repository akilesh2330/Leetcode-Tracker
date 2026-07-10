// Last updated: 7/10/2026, 2:27:25 PM
1import java.util.*;
2class Solution {
3    public List<List<String>> groupAnagrams(String[] strs) {
4        Map<String, List<String>> map = new HashMap<>();
5        for (String word : strs) {
6            char[] ch = word.toCharArray();
7            Arrays.sort(ch);
8            String key = new String(ch);
9            map.putIfAbsent(key, new ArrayList<>());
10            map.get(key).add(word);
11        }
12        return new ArrayList<>(map.values());
13    }
14}