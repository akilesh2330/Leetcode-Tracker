// Last updated: 7/25/2026, 4:19:05 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3
4        String rev = new StringBuilder(s).reverse().toString();
5        String str = s + "#" + rev;
6
7        int[] lps = new int[str.length()];
8
9        for (int i = 1; i < str.length(); i++) {
10
11            int j = lps[i - 1];
12
13            while (j > 0 && str.charAt(i) != str.charAt(j))
14                j = lps[j - 1];
15
16            if (str.charAt(i) == str.charAt(j))
17                j++;
18
19            lps[i] = j;
20        }
21
22        return rev.substring(0, s.length() - lps[str.length() - 1]) + s;
23    }
24}