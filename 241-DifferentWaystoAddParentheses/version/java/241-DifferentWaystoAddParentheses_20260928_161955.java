// Last updated: 9/28/2026, 4:19:55 PM
1class Solution {
2    public List<Integer> diffWaysToCompute(String expression) {
3        List<Integer> ans = new ArrayList<>();
4        for (int i = 0; i < expression.length(); i++) {
5            char c = expression.charAt(i);
6            if (c == '+' || c == '-' || c == '*') {
7                String left = expression.substring(0, i);
8                String right = expression.substring(i + 1);
9                List<Integer> a = diffWaysToCompute(left);
10                List<Integer> b = diffWaysToCompute(right);
11                for (int x : a) {
12                    for (int y : b) {
13                        if (c == '+')
14                            ans.add(x + y);
15                        else if (c == '-')
16                            ans.add(x - y);
17                        else
18                            ans.add(x * y);
19                    }
20                }
21            }
22        }
23        if (ans.isEmpty())
24            ans.add(Integer.parseInt(expression));
25        return ans;
26    }
27}