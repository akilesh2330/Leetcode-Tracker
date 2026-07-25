// Last updated: 7/25/2026, 4:09:26 PM
1class Solution {
2    public String countAndSay(int n) {
3
4        String result = "1";
5
6        for (int i = 2; i <= n; i++) {
7
8            StringBuilder temp = new StringBuilder();
9            int count = 1;
10
11            for (int j = 1; j < result.length(); j++) {
12
13                if (result.charAt(j) == result.charAt(j - 1)) {
14                    count++;
15                } else {
16                    temp.append(count).append(result.charAt(j - 1));
17                    count = 1;
18                }
19            }
20
21            temp.append(count).append(result.charAt(result.length() - 1));
22            result = temp.toString();
23        }
24
25        return result;
26    }
27}